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


package com.sap.ndb.bimodeldatafoundation;

import com.sap.ndb.basemodelbase.SpatialPredicate;
import com.sap.ndb.bimodelconversion.Parameterization;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional (join) properties neded to specify a spatial join
 *
 *
 * <p>Java class for SpatialJoinProperties complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SpatialJoinProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="distance" type="{http://www.sap.com/ndb/BiModelConversion.ecore}Parameterization"/&gt;
 *         &lt;element name="intersectionMatrix" type="{http://www.sap.com/ndb/BiModelConversion.ecore}Parameterization"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="predicate" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}SpatialPredicate" /&gt;
 *       &lt;attribute name="predicateEvaluatesTo" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpatialJoinProperties", propOrder = {
    "distance",
    "intersectionMatrix"
})
public class SpatialJoinProperties {

  @XmlElement(required = true)
  protected Parameterization distance;
  @XmlElement(required = true)
  protected Parameterization intersectionMatrix;
  @XmlAttribute(name = "predicate", required = true)
  protected SpatialPredicate predicate;
  @XmlAttribute(name = "predicateEvaluatesTo")
  protected Boolean predicateEvaluatesTo;

  /**
   * Gets the value of the distance property.
   *
   * @return possible object is
   * {@link Parameterization }
   */
  public Parameterization getDistance() {
    return distance;
  }

  /**
   * Sets the value of the distance property.
   *
   * @param value allowed object is
   *              {@link Parameterization }
   */
  public void setDistance(Parameterization value) {
    this.distance = value;
  }

  /**
   * Gets the value of the intersectionMatrix property.
   *
   * @return possible object is
   * {@link Parameterization }
   */
  public Parameterization getIntersectionMatrix() {
    return intersectionMatrix;
  }

  /**
   * Sets the value of the intersectionMatrix property.
   *
   * @param value allowed object is
   *              {@link Parameterization }
   */
  public void setIntersectionMatrix(Parameterization value) {
    this.intersectionMatrix = value;
  }

  /**
   * Gets the value of the predicate property.
   *
   * @return possible object is
   * {@link SpatialPredicate }
   */
  public SpatialPredicate getPredicate() {
    return predicate;
  }

  /**
   * Sets the value of the predicate property.
   *
   * @param value allowed object is
   *              {@link SpatialPredicate }
   */
  public void setPredicate(SpatialPredicate value) {
    this.predicate = value;
  }

  /**
   * Gets the value of the predicateEvaluatesTo property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public boolean isPredicateEvaluatesTo() {
    if (predicateEvaluatesTo == null) {
      return true;
    } else {
      return predicateEvaluatesTo;
    }
  }

  /**
   * Sets the value of the predicateEvaluatesTo property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setPredicateEvaluatesTo(Boolean value) {
    this.predicateEvaluatesTo = value;
  }

}