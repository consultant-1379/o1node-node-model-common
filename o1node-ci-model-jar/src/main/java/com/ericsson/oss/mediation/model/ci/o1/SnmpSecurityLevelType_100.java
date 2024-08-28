/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2023
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.oss.mediation.model.ci.o1;

import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtDefinition;
import com.ericsson.oss.itpf.modeling.annotation.edt.EdtMember;

/**
 * This represents the types of security level for SNMPv3 nodes
 */
@EModel(namespace = "O1_MED", name = "SnmpSecurityLevelType", version = "1.0.0", description = "This represents the types of security level for SNMPv3 nodes")
@EdtDefinition
public enum SnmpSecurityLevelType_100 {
    @EdtMember(value = 1, description = "Unauthenticated and unencrypted") NO_AUTH_NO_PRIV,

    @EdtMember(value = 2, description = "Authenticated but not encrypted") AUTH_NO_PRIV,

    @EdtMember(value = 3, description = "Authenticated and encrypted") AUTH_PRIV
}
