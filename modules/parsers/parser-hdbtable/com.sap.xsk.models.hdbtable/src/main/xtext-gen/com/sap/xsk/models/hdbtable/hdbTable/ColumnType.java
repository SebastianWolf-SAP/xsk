/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbtable.hdbTable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnName <em>Column Name</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnSqlType <em>Column Sql Type</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnLength <em>Column Length</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnNullable <em>Column Nullable</em>}</li>
 * </ul>
 *
 * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getColumnType()
 * @model
 * @generated
 */
public interface ColumnType extends EObject
{
  /**
   * Returns the value of the '<em><b>Column Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Name</em>' attribute.
   * @see #setColumnName(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getColumnType_ColumnName()
   * @model
   * @generated
   */
  String getColumnName();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnName <em>Column Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Name</em>' attribute.
   * @see #getColumnName()
   * @generated
   */
  void setColumnName(String value);

  /**
   * Returns the value of the '<em><b>Column Sql Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Sql Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Sql Type</em>' attribute.
   * @see #setColumnSqlType(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getColumnType_ColumnSqlType()
   * @model
   * @generated
   */
  String getColumnSqlType();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnSqlType <em>Column Sql Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Sql Type</em>' attribute.
   * @see #getColumnSqlType()
   * @generated
   */
  void setColumnSqlType(String value);

  /**
   * Returns the value of the '<em><b>Column Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Length</em>' attribute.
   * @see #setColumnLength(int)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getColumnType_ColumnLength()
   * @model
   * @generated
   */
  int getColumnLength();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnLength <em>Column Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Length</em>' attribute.
   * @see #getColumnLength()
   * @generated
   */
  void setColumnLength(int value);

  /**
   * Returns the value of the '<em><b>Column Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column Nullable</em>' attribute.
   * @see #setColumnNullable(String)
   * @see com.sap.xsk.models.hdbtable.hdbTable.HdbTablePackage#getColumnType_ColumnNullable()
   * @model
   * @generated
   */
  String getColumnNullable();

  /**
   * Sets the value of the '{@link com.sap.xsk.models.hdbtable.hdbTable.ColumnType#getColumnNullable <em>Column Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column Nullable</em>' attribute.
   * @see #getColumnNullable()
   * @generated
   */
  void setColumnNullable(String value);

} // ColumnType