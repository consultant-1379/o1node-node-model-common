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

import com.ericsson.mediation.model.ci.ConnectivityInformation_100;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.AttributeChangeEventHandling;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.CommonChangeEventBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.Hierarchical;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.OnReadWrite;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeAttribute;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeChangeEventHandling;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.PrimaryTypeDefinition;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.ReadBehavior;
import com.ericsson.oss.itpf.datalayer.dps.modeling.annotation.WriteBehavior;
import com.ericsson.oss.itpf.modeling.annotation.DefaultValue;
import com.ericsson.oss.itpf.modeling.annotation.EModel;
import com.ericsson.oss.itpf.modeling.annotation.EModelAttribute;
import com.ericsson.oss.itpf.modeling.annotation.IpAddress;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Max;
import com.ericsson.oss.itpf.modeling.annotation.constraints.Min;
import com.ericsson.oss.itpf.modeling.annotation.constraints.NotNull;

@EModel(description = "This MO encapsulates all the connectivity attributes for the O1 based nodes.", name = "O1ConnectivityInformation",
        namespace = "O1_MED", version = "1.1.0")
@PrimaryTypeDefinition
@Hierarchical(parentMoTypeUrn = "")
@OnReadWrite(onRead = ReadBehavior.READ_FROM_PERSISTENT_STORAGE, onWrite = WriteBehavior.WRITE_TO_DELEGATE)
@PrimaryTypeChangeEventHandling(onCreatePo = { PrimaryTypeChangeEventBehavior.NAMES, PrimaryTypeChangeEventBehavior.VALUES },
        onDeletePo = { PrimaryTypeChangeEventBehavior.NAMES, PrimaryTypeChangeEventBehavior.VALUES })
public class O1ConnectivityInformation_100 extends ConnectivityInformation_100 {

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The unique key identifying this particular MO", mandatory = true, immutable = true, key = true)
    @NotNull
    private String O1ConnectivityInformationId;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The IP address", mandatory = true)
    @IpAddress
    @NotNull
    @AttributeChangeEventHandling(onModifyAttr = { CommonChangeEventBehavior.VALUE })
    private String ipAddress;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The port number of the node where the SNMP agent is listening.", mandatory = false)
    @DefaultValue(value = "161")
    @Min(value = 1)
    @Max(value = 65535)
    private int snmpAgentPort;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The port number where ENM is listening to SNMP traps.", mandatory = false)
    @DefaultValue(value = "162")
    @Min(value = 1)
    @Max(value = 65535)
    private int snmpTrapPort;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The SNMP version to be used towards the node", mandatory = false)
    @DefaultValue(value = "SNMP_V2C")
    private SnmpVersion_100 snmpVersion;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Community string to be used for SNMP GET management", mandatory = false)
    @DefaultValue(value = "public")
    private String snmpReadCommunity;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Community string to be used for SNMP SET management", mandatory = false)
    @DefaultValue(value = "public")
    private String snmpWriteCommunity;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "The netconf port", mandatory = false)
    @DefaultValue(value = "22")
    @AttributeChangeEventHandling(onModifyAttr = { CommonChangeEventBehavior.VALUE })
    private int port;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "Transport protocol provided by node", mandatory = false)
    @DefaultValue(value = "SSH")
    private TransportProtocolType_100 transportProtocol;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "SNMP security name", mandatory = false)
    private String snmpSecurityName;

    @PrimaryTypeAttribute
    @EModelAttribute(description = "SNMP security level", mandatory = false)
    private SnmpSecurityLevelType_100 snmpSecurityLevel;
}
