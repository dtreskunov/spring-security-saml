/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.springframework.security.saml2.metadata;

import java.util.List;

import org.springframework.security.saml2.attribute.Attribute;

/**
 * Represents an IDPSSODescriptor
 * https://www.oasis-open.org/committees/download.php/35391/sstc-saml-metadata-errata-2.0-wd-04-diff.pdf
 */
public interface IdentityProviderDescriptor extends ProviderDescriptor {
    boolean getWantAuthnRequestsSigned();
    List<Endpoint> getSingleSignOnService();
    List<Endpoint> getNameIDMappingService();
    List<Endpoint> getAssertionIDRequestService();
    List<String> getAttributeProfile();
    List<Attribute> getAttribute();
}
