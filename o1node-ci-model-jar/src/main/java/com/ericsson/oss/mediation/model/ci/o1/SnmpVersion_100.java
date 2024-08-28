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
 * This represents the possible versions of the SNMP protocol.
 *
 * <p>
 * Java classes are only used to generate model XML; suffixes are added to the class name to mark current model version. If a new iteration of a model
 * is required then a new class with another version suffix should be created.
 * </p>
 *
 */
@EModel(namespace = "O1_MED", name = "SnmpVersion", version = "1.0.0", description = "This represents the version for SNMP protocol")
@EdtDefinition
public enum SnmpVersion_100 {

    @EdtMember(value = 1, description = "SNMP v2c")
    SNMP_V2C,

    @EdtMember(value = 2, description = "SNMP v3")
    SNMP_V3
}
