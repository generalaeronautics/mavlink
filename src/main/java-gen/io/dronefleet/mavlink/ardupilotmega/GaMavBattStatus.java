package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Battery data from Companion computer 
 */
@MavlinkMessageInfo(
        id = 7000,
        crc = 90,
        description = "Battery data from Companion computer"
)
public final class GaMavBattStatus {
    private final int targetSystem;

    private final int targetComponent;

    private final int voltage;

    private final int current;

    private final int consumedMah;

    private GaMavBattStatus(int targetSystem, int targetComponent, int voltage, int current,
            int consumedMah) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.voltage = voltage;
        this.current = current;
        this.consumedMah = consumedMah;
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
     * Battery Voltage * 10 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            signed = true,
            description = "Battery Voltage * 10"
    )
    public final int voltage() {
        return this.voltage;
    }

    /**
     * Battery Current * 10 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            signed = true,
            description = "Battery Current * 10"
    )
    public final int current() {
        return this.current;
    }

    /**
     * Battery Consumed mAh 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true,
            description = "Battery Consumed mAh"
    )
    public final int consumedMah() {
        return this.consumedMah;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GaMavBattStatus other = (GaMavBattStatus)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(voltage, other.voltage)) return false;
        if (!Objects.deepEquals(current, other.current)) return false;
        if (!Objects.deepEquals(consumedMah, other.consumedMah)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(voltage);
        result = 31 * result + Objects.hashCode(current);
        result = 31 * result + Objects.hashCode(consumedMah);
        return result;
    }

    @Override
    public String toString() {
        return "GaMavBattStatus{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", voltage=" + voltage
                 + ", current=" + current
                 + ", consumedMah=" + consumedMah + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int voltage;

        private int current;

        private int consumedMah;

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
         * Battery Voltage * 10 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                signed = true,
                description = "Battery Voltage * 10"
        )
        public final Builder voltage(int voltage) {
            this.voltage = voltage;
            return this;
        }

        /**
         * Battery Current * 10 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                signed = true,
                description = "Battery Current * 10"
        )
        public final Builder current(int current) {
            this.current = current;
            return this;
        }

        /**
         * Battery Consumed mAh 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true,
                description = "Battery Consumed mAh"
        )
        public final Builder consumedMah(int consumedMah) {
            this.consumedMah = consumedMah;
            return this;
        }

        public final GaMavBattStatus build() {
            return new GaMavBattStatus(targetSystem, targetComponent, voltage, current, consumedMah);
        }
    }
}
