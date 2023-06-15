package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * 1)Request send from GCS to Companion Computer to prepare logs to download, and to note current 
 * date and time. 2)Confirmation from Comp. Computer to GCS to initiate downloading 
 */
@MavlinkMessageInfo(
        id = 6001,
        crc = 159,
        description = "1)Request send from GCS to Companion Computer to prepare logs to download, and to note current date and time. 2)Confirmation from Comp. Computer to GCS to initiate downloading"
)
public final class NpntReqLogs {
    private final int targetSystem;

    private final int targetComponent;

    private final int reqConfirm;

    private final byte[] dateTime;

    private NpntReqLogs(int targetSystem, int targetComponent, int reqConfirm, byte[] dateTime) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.reqConfirm = reqConfirm;
        this.dateTime = dateTime;
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
    public final int reqConfirm() {
        return this.reqConfirm;
    }

    /**
     * Date_time as string format yyyymmdd_hhmmss, send by GCS 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            arraySize = 15,
            description = "Date_time as string format yyyymmdd_hhmmss, send by GCS"
    )
    public final byte[] dateTime() {
        return this.dateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntReqLogs other = (NpntReqLogs)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(reqConfirm, other.reqConfirm)) return false;
        if (!Objects.deepEquals(dateTime, other.dateTime)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(reqConfirm);
        result = 31 * result + Objects.hashCode(dateTime);
        return result;
    }

    @Override
    public String toString() {
        return "NpntReqLogs{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", reqConfirm=" + reqConfirm
                 + ", dateTime=" + dateTime + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int reqConfirm;

        private byte[] dateTime;

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
        public final Builder reqConfirm(int reqConfirm) {
            this.reqConfirm = reqConfirm;
            return this;
        }

        /**
         * Date_time as string format yyyymmdd_hhmmss, send by GCS 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                arraySize = 15,
                description = "Date_time as string format yyyymmdd_hhmmss, send by GCS"
        )
        public final Builder dateTime(byte[] dateTime) {
            this.dateTime = dateTime;
            return this;
        }

        public final NpntReqLogs build() {
            return new NpntReqLogs(targetSystem, targetComponent, reqConfirm, dateTime);
        }
    }
}
