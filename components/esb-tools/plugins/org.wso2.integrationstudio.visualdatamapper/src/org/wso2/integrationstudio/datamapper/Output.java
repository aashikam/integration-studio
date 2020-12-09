/**
 */
package org.wso2.integrationstudio.datamapper;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.datamapper.Output#getTreeNode <em>Tree Node</em>}</li>
 * </ul>
 *
 * @see org.wso2.integrationstudio.datamapper.DataMapperPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends DataMapperNode {

	/**
	 * Returns the value of the '<em><b>Tree Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.wso2.integrationstudio.datamapper.TreeNode}.
	 * It is bidirectional and its opposite is '{@link org.wso2.integrationstudio.datamapper.TreeNode#getOutputParent <em>Output Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Node</em>' containment reference list.
	 * @see org.wso2.integrationstudio.datamapper.DataMapperPackage#getOutput_TreeNode()
	 * @see org.wso2.integrationstudio.datamapper.TreeNode#getOutputParent
	 * @model opposite="outputParent" containment="true"
	 * @generated
	 */
	EList<TreeNode> getTreeNode();
} // Output
