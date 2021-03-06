/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shibboleth.idp.attribute.filter.spring.saml.impl;

import javax.annotation.Nonnull;
import javax.xml.namespace.QName;

import net.shibboleth.idp.attribute.filter.spring.BaseFilterParser;
import net.shibboleth.idp.attribute.filter.spring.policyrule.BasePolicyRuleParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * Parser for AttributeIssuerNameIDFormatExactPolicyRule.
 */
public class AttributeIssuerNameIdFormatRuleParser extends BasePolicyRuleParser {

    /** Schema name. */
    public static final String SCHEMA_NAME = "AttributeIssuerNameIDFormatExactMatch";

    /** Schema type - saml. */
    public static final QName SCHEMA_TYPE = new QName(AttributeFilterSAMLNamespaceHandler.NAMESPACE, SCHEMA_NAME);

    /** Schema type - afp. */
    public static final QName SCHEMA_TYPE_AFP = new QName(BaseFilterParser.NAMESPACE, SCHEMA_NAME);

    /** Class logger. */
    private final Logger log = LoggerFactory.getLogger(AttributeIssuerEntityAttributeExactRuleParser.class);

    /** {@inheritDoc} */
    @Override @Nonnull protected Class<?> getNativeBeanClass() {

        log.error("Unimplemented Attribute Filter {}.  Consider other implementation methods.", SCHEMA_NAME);
        throw new BeanCreationException("Unimplemented filter " + SCHEMA_NAME);
    }

    /** {@inheritDoc} */
    @Override protected QName getAFPName() {
        return SCHEMA_TYPE;
    }

    /** {@inheritDoc} */
    @Override protected void doNativeParse(@Nonnull Element element, @Nonnull ParserContext parserContext,
            @Nonnull BeanDefinitionBuilder builder) {
        log.error("Unimplemented Attribute Filter {}.  Consider other implementation methods.", SCHEMA_NAME);
        throw new BeanCreationException("Unimplemented filter " + SCHEMA_NAME);
    }
}
