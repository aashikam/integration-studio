/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.esb.form.editors.article.providers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.integrationstudio.eclipse.gmf.esb.MessageStoreParameter;

/**
 * MessageStore parameters configuration dialogBox.
 *
 */
public class ConfigureMessageStoreParametersDialog extends Dialog {

	/**
	 * title label.
	 */
	private Label parameterLabel;
	/**
	 * dummy text.
	 */
	private Text dummy;
	/**
	 * Button for adding a new parameter.
	 */
	private Button newParameterButton;
	/**
	 * Table of parameters.
	 */
	private Table parametersTable;
	/**
	 * Button for deleting an existing Parameter.
	 */
	private Button removeParameterButton;
	
	/**
	 * Table editor
	 */
	private TableEditor parameterEditor;
	
	private List<MessageStoreParameter> messageStoreParamList = new ArrayList<MessageStoreParameter>();
	
	private String[] properties = { "store.jms.ConsumerReceiveTimeOut" };

	
	public ConfigureMessageStoreParametersDialog(Shell parentShell, List<MessageStoreParameter> list) {
		super(parentShell);
		setShellStyle(getShellStyle() | SWT.RESIZE); 
		// When updating an existing property, then get the property list
		if (list != null) {
			messageStoreParamList = list;
		} else {
		// When adding properties initially, create a new list
		list = new ArrayList<MessageStoreParameter>();
		}
	}
	
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		FormLayout mainLayout = new FormLayout();
		mainLayout.marginHeight = 5;
		mainLayout.marginWidth = 5;
		container.setLayout(mainLayout);
		
		
		parameterLabel = new Label(container, SWT.NONE);
		{
			parameterLabel.setText("Parameters:");
			FormData proxyParameterLabelLayoutData = new FormData();
			proxyParameterLabelLayoutData.top = new FormAttachment(
					dummy, 10);
			proxyParameterLabelLayoutData.left = new FormAttachment(0);
			parameterLabel.setLayoutData(proxyParameterLabelLayoutData);
		}

		newParameterButton = new Button(container, SWT.NONE);
		{
			newParameterButton.setText("New...");
			FormData newProxyParameterButtonLayoutData = new FormData(80,
					SWT.DEFAULT);
			newProxyParameterButtonLayoutData.top = new FormAttachment(
					parameterLabel, 10);
			newProxyParameterButtonLayoutData.right = new FormAttachment(100);
			newParameterButton.setLayoutData(newProxyParameterButtonLayoutData);

			newParameterButton.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					TableItem item = bindPram(EsbFactory.eINSTANCE
							.createMessageStoreParameter());
					item.setText(0,"param" + parametersTable.getItemCount());
					item.setText(1,"value");
					parametersTable.select(parametersTable.indexOf(item));
				}
			});
		}

		removeParameterButton = new Button(container, SWT.NONE);
		{
			removeParameterButton.setText("Remove");
			FormData removeProxyParameterButtonLayoutData = new FormData();
			removeProxyParameterButtonLayoutData.top = new FormAttachment(
					newParameterButton, 5);
			removeProxyParameterButtonLayoutData.right = new FormAttachment(100);
			removeProxyParameterButtonLayoutData.left = new FormAttachment(
					newParameterButton, 0, SWT.LEFT);
			removeParameterButton
					.setLayoutData(removeProxyParameterButtonLayoutData);

			removeParameterButton.addListener(SWT.Selection, new Listener() {
				public void handleEvent(Event event) {
					int selectedIndex = parametersTable.getSelectionIndex();
					if (-1 != selectedIndex) {
						unbindParam(selectedIndex);
						// Select the next available candidate for deletion.
						if (selectedIndex < parametersTable.getItemCount()) {
							parametersTable.select(selectedIndex);
						} else {
							parametersTable.select(selectedIndex - 1);
						}
					}
				}
			});
		}

		parametersTable = new Table(container, SWT.BORDER
				| SWT.FULL_SELECTION | SWT.HIDE_SELECTION);
		{
			TableColumn nameColumn = new TableColumn(parametersTable,
					SWT.LEFT);
			nameColumn.setText("Name");
			nameColumn.setWidth(120);
			
			TableColumn valueColumn = new TableColumn(parametersTable,
					SWT.LEFT);
			valueColumn.setText("Value");
			valueColumn.setWidth(120);

			parametersTable.setHeaderVisible(true);
			parametersTable.setLinesVisible(true);

			Listener tblPropertiesListener = new Listener() {
				
				public void handleEvent(Event evt) {
					if (null != evt.item) {
						if (evt.item instanceof TableItem) {
							TableItem item = (TableItem) evt.item;
							editItem(item);
						}
					} 
				}
			};

			parametersTable
					.addListener(SWT.Selection, tblPropertiesListener);

			
			// When updating an existing property
			if (messageStoreParamList.size() > 0) {
				if (getMissingProperties() != null) {
					messageStoreParamList.addAll(getMissingProperties());
				}
				for (MessageStoreParameter property : messageStoreParamList) {
					bindPram(property);
				}
			} else {
				// when adding properties for the first time
				for (int i = 0; i < properties.length; i++) {
					bindPram(properties[i]);
				}
			}

			

			// In-line editing of parameters.
			setupTableEditor(parametersTable);

			// Layout.
			FormData parametersTableLayoutData = new FormData(SWT.DEFAULT,
					150);
			parametersTableLayoutData.top = new FormAttachment(
					newParameterButton, 0, SWT.TOP);
			parametersTableLayoutData.left = new FormAttachment(0);
			parametersTableLayoutData.right = new FormAttachment(
					newParameterButton, -5);
			parametersTableLayoutData.bottom = new FormAttachment(100);
			parametersTable.setLayoutData(parametersTableLayoutData);
		}
		
		
		
		return container;
	}
	
	/**
	 * Get missing required properties
	 */
	private List<MessageStoreParameter> getMissingProperties() {
		List<MessageStoreParameter> newList = new ArrayList<MessageStoreParameter>();
		for (String prop : properties) {
			boolean isAvailable = false;
			for (MessageStoreParameter property : messageStoreParamList) {
				if (prop.equals(property.getParameterName())) {
					isAvailable = true;
					break;
				}
			}
			if (!isAvailable) {
				MessageStoreParameter tskProperty = createProperty(prop);
				newList.add(tskProperty);
			}
		}
		return newList;
	}
	
	/**
	 * Creates a new property
	 * 
	 * @param name
	 * @return
	 */
	private MessageStoreParameter createProperty(String name) {
		MessageStoreParameter newPrp = EsbFactory.eINSTANCE.createMessageStoreParameter();
		newPrp.setParameterName(name);
		newPrp.setParameterValue(null);
		return newPrp;
	}
	
	
	private TableItem bindPram(MessageStoreParameter param) {
		TableItem item = new TableItem(parametersTable, SWT.NONE);
		item.setText(new String[] {param.getParameterName(),param.getParameterValue()});
		item.setData(param);
		return item;
	}
	
	private TableItem bindPram(String value) {
		TableItem item = new TableItem(parametersTable, SWT.NONE);
		item.setText(new String[] { value, null});
		return item;
	}

	
	private void unbindParam(int itemIndex) {
		TableItem item = parametersTable.getItem(itemIndex);
		MessageStoreParameter param = (MessageStoreParameter) item.getData();
		removeTaskProperty(param);
		parametersTable.remove(parametersTable.indexOf(item));
	}

	private void removeTaskProperty(MessageStoreParameter param) {
		if (param != null) {
			for (MessageStoreParameter propertyItem : messageStoreParamList) {
				if (propertyItem.getParameterName().equals(param.getParameterName())) {
					messageStoreParamList.remove(propertyItem);
					break;
				}
			}
		}
	}
	
	private void editItem(final TableItem item) {
		parameterEditor = initTableEditor(parameterEditor,
				item.getParent());
		item.getParent().redraw();
		item.getParent().layout();
	
	}
	private TableEditor initTableEditor(TableEditor editor, Table table) {
		if (null != editor) {
			Control lastCtrl = editor.getEditor();
			if (null != lastCtrl) {
				lastCtrl.dispose();
			}
		}
		editor = new TableEditor(table);
		editor.horizontalAlignment = SWT.LEFT;
		editor.grabHorizontal = true;
		return editor;
	}
	
	/**
	 * Sets up a table editor that allows users to edit cell values inline.
	 * 
	 * @param table
	 *            table against which a table editor is setup.
	 */
	private void setupTableEditor(final Table table) {
		final TableEditor cellEditor = new TableEditor(table);
		cellEditor.grabHorizontal = true;
		cellEditor.minimumWidth = 50;
		table.addMouseListener(new MouseAdapter() {
			/**
			 * Setup a new cell editor control at double click event.
			 */
			public void mouseDoubleClick(MouseEvent e) {
				// Dispose the old editor control (if one is setup).
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl)
					oldEditorControl.dispose();

				// Mouse location.
				Point mouseLocation = new Point(e.x, e.y);

				// Grab the selected row.
				TableItem item = (TableItem) table.getItem(mouseLocation);
				if (null == item)
					return;

				// Determine which column was selected.
				int selectedColumn = -1;
				for (int i = 0, n = table.getColumnCount(); i < n; i++) {
					if (item.getBounds(i).contains(mouseLocation)) {
						selectedColumn = i;
						break;
					}
				}

				// Setup a new editor control.
				if (-1 != selectedColumn) {
					Text editorControl = new Text(table, SWT.NONE);
					final int editorControlColumn = selectedColumn;
					editorControl.setText(item.getText(selectedColumn));
					editorControl.addModifyListener(new ModifyListener() {
						public void modifyText(ModifyEvent e) {
							Text text = (Text) cellEditor.getEditor();
							cellEditor.getItem().setText(editorControlColumn,
									text.getText());
						}
					});
					editorControl.selectAll();
					editorControl.setFocus();
					cellEditor.setEditor(editorControl, item, selectedColumn);
				}
			}

			/**
			 * Dispose cell editor control at mouse down (otherwise the control
			 * keep showing).
			 */
			public void mouseDown(MouseEvent e) {
				Control oldEditorControl = cellEditor.getEditor();
				if (null != oldEditorControl)
					oldEditorControl.dispose();
			}
		});
	}
	
	
	protected void okPressed() {
		// parameters.
		for (TableItem item : parametersTable.getItems()) {
			
			MessageStoreParameter parameter = null;
			
			if (item.getData() == null) {
				parameter = EsbFactory.eINSTANCE.createMessageStoreParameter();
				parameter.setParameterName(item.getText(0));
				parameter.setParameterValue(item.getText(1));

			}else{
				parameter = (MessageStoreParameter) item.getData();
				parameter.setParameterName(item.getText(0));
				parameter.setParameterValue(item.getText(1));
				
			}
			
			for (MessageStoreParameter propertyItem : messageStoreParamList) {
				// When updating the existing properties, remove the old
				// property
				if (propertyItem.getParameterName().equals(parameter.getParameterName())) {
					messageStoreParamList.remove(propertyItem);
					break;
				}
			}
			messageStoreParamList.add(parameter);
		}
		setMessageStorePropertyList(messageStoreParamList);
		super.okPressed();
	}

	public void setMessageStorePropertyList(List<MessageStoreParameter> messageStoreParamList) {
		this.messageStoreParamList = messageStoreParamList;

	}

	public List<MessageStoreParameter> getMessageStorePropertyList() {
		return messageStoreParamList;
	}

	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Parameters Configuration");
	}
	
	protected Point getInitialSize() {
		return new Point(450, 317);
	}

}
