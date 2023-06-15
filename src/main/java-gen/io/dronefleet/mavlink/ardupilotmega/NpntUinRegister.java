package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * 1)Request send from GCS to Companion Computer to register UIN 2)Confirmation(0 or 1) from 
 * Comp. Computer to GCS 
 */
@MavlinkMessageInfo(
        id = 6002,
        crc = 71,
        description = "1)Request send from GCS to Companion Computer to register UIN 2)Confirmation(0 or 1) from Comp. Computer to GCS"
)
public final class NpntUinRegister {
    private final int targetSystem;

    private final int targetComponent;

    private final int confirm;

    private final int size;

    private final byte[] uin;

    private NpntUinRegister(int targetSystem, int targetComponent, int confirm, int size,
            byte[] uin) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.confirm = confirm;
        this.size = size;
        this.uin = uin;
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
            description = "0 -> not confirmed, 1 -> confirmed, send by Comp.Computer"
    )
    public final int confirm() {
        return this.confirm;
    }

    /**
     * size of UIN send by Comp.Computer 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "size of UIN send by Comp.Computer"
    )
    public final int size() {
        return this.size;
    }

    /**
     * UIN as string, send by GCS 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 30,
            description = "UIN as string, send by GCS"
    )
    public final byte[] uin() {
        return this.uin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntUinRegister other = (NpntUinRegister)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(confirm, other.confirm)) return false;
        if (!Objects.deepEquals(size, other.size)) return false;
        if (!Objects.deepEquals(uin, other.uin)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(confirm);
        result = 31 * result + Objects.hashCode(size);
        result = 31 * result + Objects.hashCode(uin);
        return result;
    }

    @Override
    public String toString() {
        return "NpntUinRegister{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", confirm=" + confirm
                 + ", size=" + size
                 + ", uin=" + uin + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int confirm;

        private int size;

        private byte[] uin;

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
                description = "0 -> not confirmed, 1 -> confirmed, send by Comp.Computer"
        )
        public final Builder confirm(int confirm) {
            this.confirm = confirm;
            return this;
        }

        /**
         * size of UIN send by Comp.Computer 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "size of UIN send by Comp.Computer"
        )
        public final Builder size(int size) {
            this.size = size;
            return this;
        }

        /**
         * UIN as string, send by GCS 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 30,
                description = "UIN as string, send by GCS"
        )
        public final Builder uin(byte[] uin) {
            this.uin = uin;
            return this;
        }

        public final NpntUinRegister build() {
            return new NpntUinRegister(targetSystem, targetComponent, confirm, size, uin);
        }
    }
}
