/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.10.26 at 02:11:54 PM CEST
//

package org.eclipse.kura.configuration.metatype;

/**
 * <p>
 * Java class for Tdesignate complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Tdesignate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Object" type="{http://www.osgi.org/xmlns/metatype/v1.2.0}Tobject"/&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="factoryPid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="bundle" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="merge" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;anyAttribute/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public interface Designate {

    /**
     * Gets the value of the object property.
     *
     * @return
     *         possible object is
     *         {@link TObject }
     *
     */
    public TObject getObject();

    /**
     * Gets the value of the pid property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getPid();

    /**
     * Gets the value of the factoryPid property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getFactoryPid();

    /**
     * Gets the value of the bundle property.
     *
     * @return
     *         possible object is
     *         {@link String }
     *
     */
    public String getBundle();

    /**
     * Gets the value of the optional property.
     *
     * @return
     *         possible object is
     *         {@link Boolean }
     *
     */
    public boolean isOptional();

    /**
     * Gets the value of the merge property.
     *
     * @return
     *         possible object is
     *         {@link Boolean }
     *
     */
    public boolean isMerge();

}
