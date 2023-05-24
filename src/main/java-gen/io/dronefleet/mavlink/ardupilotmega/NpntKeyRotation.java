package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * 1)Request send from GCS to Companion Computer for key rotation 2)Confirmation(0 or 1) from 
 * Comp. Computer to GCS, 0 to download pending flight logs 
 */
@MavlinkMessageInfo(
        id = 6003,
        crc = 207,
        description = "1)Request send from GCS to Companion Computer for key rotation\n"
                        + "        2)Confirmation(0 or 1) from Comp. Computer to GCS, 0 to download pending flight logs"
)
public final class NpntKeyRotation {
    private final int targetSystem;

    private final int targetComponent;

    private final int confirm;

    private NpntKeyRotation(int targetSystem, int targetComponent, int confirm) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.confirm = confirm;
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
     * 0 -&gt; not confirmed, 1 -&gt; confirmed, send by Comp.Computer 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "0 -> not confirmed, 1 -> confirmed, send by\n"
                            + "        Comp.Computer"
    )
    public final int confirm() {
        return this.confirm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntKeyRotation other = (NpntKeyRotation)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(confirm, other.confirm)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(confirm);
        return result;
    }

    @Override
    public String toString() {
        return "NpntKeyRotation{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", confirm=" + confirm + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int confirm;

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
         * 0 -&gt; not confirmed, 1 -&gt; confirmed, send by Comp.Computer 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "0 -> not confirmed, 1 -> confirmed, send by\n"
                                + "        Comp.Computer"
        )
        public final Builder confirm(int confirm) {
            this.confirm = confirm;
            return this;
        }

        public final NpntKeyRotation build() {
            return new NpntKeyRotation(targetSystem, targetComponent, confirm);
        }
    }
}
