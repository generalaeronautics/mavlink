package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * 1)Request send from GCS to Companion Computer to update key rotation time 2)Confirmation(0 or 
 * 1) from Comp. Computer to GCS 
 */
@MavlinkMessageInfo(
        id = 6007,
        crc = 2,
        description = "1)Request send from GCS to Companion Computer to update key rotation time\n"
                        + "        2)Confirmation(0 or 1) from Comp. Computer to GCS"
)
public final class NpntKeyRotationTime {
    private final int targetSystem;

    private final int targetComponent;

    private final int confirm;

    private final int size;

    private final String keyrotTime;

    private NpntKeyRotationTime(int targetSystem, int targetComponent, int confirm, int size,
            String keyrotTime) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.confirm = confirm;
        this.size = size;
        this.keyrotTime = keyrotTime;
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

    /**
     * size of key rotation time string send by Comp.Computer 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "size of key rotation time string send by\n"
                            + "        Comp.Computer"
    )
    public final int size() {
        return this.size;
    }

    /**
     * key rotation time as string, send by GCS 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 15,
            description = "key rotation time as string, send by GCS"
    )
    public final String keyrotTime() {
        return this.keyrotTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntKeyRotationTime other = (NpntKeyRotationTime)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(confirm, other.confirm)) return false;
        if (!Objects.deepEquals(size, other.size)) return false;
        if (!Objects.deepEquals(keyrotTime, other.keyrotTime)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(confirm);
        result = 31 * result + Objects.hashCode(size);
        result = 31 * result + Objects.hashCode(keyrotTime);
        return result;
    }

    @Override
    public String toString() {
        return "NpntKeyRotationTime{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", confirm=" + confirm
                 + ", size=" + size
                 + ", keyrotTime=" + keyrotTime + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int confirm;

        private int size;

        private String keyrotTime;

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

        /**
         * size of key rotation time string send by Comp.Computer 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "size of key rotation time string send by\n"
                                + "        Comp.Computer"
        )
        public final Builder size(int size) {
            this.size = size;
            return this;
        }

        /**
         * key rotation time as string, send by GCS 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 15,
                description = "key rotation time as string, send by GCS"
        )
        public final Builder keyrotTime(String keyrotTime) {
            this.keyrotTime = keyrotTime;
            return this;
        }

        public final NpntKeyRotationTime build() {
            return new NpntKeyRotationTime(targetSystem, targetComponent, confirm, size, keyrotTime);
        }
    }
}
