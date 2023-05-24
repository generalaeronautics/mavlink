package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Firmware update result from Comp. Computer to GCS 
 */
@MavlinkMessageInfo(
        id = 6009,
        crc = 108,
        description = "Firmware update result from Comp. Computer to GCS"
)
public final class NpntFirmwareUpdateResult {
    private final int targetSystem;

    private final int targetComponent;

    private final int result;

    private final String remarks;

    private NpntFirmwareUpdateResult(int targetSystem, int targetComponent, int result,
            String remarks) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.result = result;
        this.remarks = remarks;
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
     * 0 -&gt; firmware update failed, 1 -&gt; firmware update successful 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "0 -> firmware update failed, 1 -> firmware update\n"
                            + "        successful"
    )
    public final int result() {
        return this.result;
    }

    /**
     * firmware update result remarks 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 200,
            description = "firmware update result remarks"
    )
    public final String remarks() {
        return this.remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntFirmwareUpdateResult other = (NpntFirmwareUpdateResult)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(result, other.result)) return false;
        if (!Objects.deepEquals(remarks, other.remarks)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(result);
        result = 31 * result + Objects.hashCode(remarks);
        return result;
    }

    @Override
    public String toString() {
        return "NpntFirmwareUpdateResult{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", result=" + result
                 + ", remarks=" + remarks + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int result;

        private String remarks;

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
         * 0 -&gt; firmware update failed, 1 -&gt; firmware update successful 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "0 -> firmware update failed, 1 -> firmware update\n"
                                + "        successful"
        )
        public final Builder result(int result) {
            this.result = result;
            return this;
        }

        /**
         * firmware update result remarks 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 200,
                description = "firmware update result remarks"
        )
        public final Builder remarks(String remarks) {
            this.remarks = remarks;
            return this;
        }

        public final NpntFirmwareUpdateResult build() {
            return new NpntFirmwareUpdateResult(targetSystem, targetComponent, result, remarks);
        }
    }
}
