package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * FCS Parameter request 
 */
@MavlinkMessageInfo(
        id = 7006,
        crc = 247,
        description = "FCS Parameter request"
)
public final class GaGetParamExt {
    private final int targetSystem;

    private final int targetComponent;

    private final String paramId;

    private final String paramAuxId1;

    private final String paramAuxId2;

    private GaGetParamExt(int targetSystem, int targetComponent, String paramId, String paramAuxId1,
            String paramAuxId2) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.paramId = paramId;
        this.paramAuxId1 = paramAuxId1;
        this.paramAuxId2 = paramAuxId2;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * System ID (0 for broadcast) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "System ID (0 for broadcast)"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID (0 for broadcast) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "Component ID (0 for broadcast)"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Key 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 50,
            description = "Key"
    )
    public final String paramId() {
        return this.paramId;
    }

    /**
     * Value 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 50,
            description = "Value"
    )
    public final String paramAuxId1() {
        return this.paramAuxId1;
    }

    /**
     * Value 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 50,
            description = "Value"
    )
    public final String paramAuxId2() {
        return this.paramAuxId2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GaGetParamExt other = (GaGetParamExt)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(paramId, other.paramId)) return false;
        if (!Objects.deepEquals(paramAuxId1, other.paramAuxId1)) return false;
        if (!Objects.deepEquals(paramAuxId2, other.paramAuxId2)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(paramId);
        result = 31 * result + Objects.hashCode(paramAuxId1);
        result = 31 * result + Objects.hashCode(paramAuxId2);
        return result;
    }

    @Override
    public String toString() {
        return "GaGetParamExt{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", paramId=" + paramId
                 + ", paramAuxId1=" + paramAuxId1
                 + ", paramAuxId2=" + paramAuxId2 + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private String paramId;

        private String paramAuxId1;

        private String paramAuxId2;

        /**
         * System ID (0 for broadcast) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "System ID (0 for broadcast)"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID (0 for broadcast) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "Component ID (0 for broadcast)"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Key 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 50,
                description = "Key"
        )
        public final Builder paramId(String paramId) {
            this.paramId = paramId;
            return this;
        }

        /**
         * Value 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 50,
                description = "Value"
        )
        public final Builder paramAuxId1(String paramAuxId1) {
            this.paramAuxId1 = paramAuxId1;
            return this;
        }

        /**
         * Value 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 50,
                description = "Value"
        )
        public final Builder paramAuxId2(String paramAuxId2) {
            this.paramAuxId2 = paramAuxId2;
            return this;
        }

        public final GaGetParamExt build() {
            return new GaGetParamExt(targetSystem, targetComponent, paramId, paramAuxId1, paramAuxId2);
        }
    }
}
