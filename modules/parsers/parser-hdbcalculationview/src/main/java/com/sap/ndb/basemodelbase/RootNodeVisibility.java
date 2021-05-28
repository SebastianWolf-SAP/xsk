/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RootNodeVisibility.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RootNodeVisibility"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD_ROOT_NODE_IF_DEFINED"/&gt;
 *     &lt;enumeration value="ADD_ROOT_NODE"/&gt;
 *     &lt;enumeration value="DO_NOT_ADD_ROOT_NODE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "RootNodeVisibility")
@XmlEnum
public enum RootNodeVisibility {


  /**
   * (default): The system will add the root node of the	hierarchy if it is explicitly defined, but the system will
   * not add an extra artificial root node.
   */
  ADD_ROOT_NODE_IF_DEFINED,

  /**
   * The system will always add an artificial single root node to the hierarchy.	All other nodes are descendants of this node.
   */
  ADD_ROOT_NODE,

  /**
   * The system will not add an artificial single root node to the hierarchy.
   * Example 1: Assume we have the following simple table with a parent child hierarchy defined on top: A->B and A->C
   * Then we have: ADD_ROOT_NODE_IF_DEFINED, ADD_ROOT_NODE: Results in a 2 level hierarchy with A at the root having B,
   * C as children	DO_NOT_ADD_ROOT_NODE: Results in a 1 level hierarchy with B and C as independent root nodes
   * Example 2: Assume we have the following simple table with a parent child hierarchy defined on top.
   * null->A	and A->B and A->C
   * Then we have: ADD_ROOT_NODE_IF_DEFINED, DO_NOT_ADD_ROOT_NODE: Results in a 2 level hierarchy with A at the root
   * having B,C as children	ADD_ROOT_NODE: Results in a 3 level hierarchy with null as root node having A as
   * child and A having B,C as children.
   */
  DO_NOT_ADD_ROOT_NODE;

  public static RootNodeVisibility fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}