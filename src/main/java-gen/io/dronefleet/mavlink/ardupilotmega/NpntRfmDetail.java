package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * 1)Request send from GCS to Companion Computer for knowing RFM details 
 */
@MavlinkMessageInfo(
        id = 6004,
        crc = 116,
        description = "1)Request send from GCS to Companion Computer for knowing RFM details"
)
public final class NpntRfmDetail {
    private final int targetSystem;

    private final int targetComponent;

    private final String ver;

    private final int lenVer;

    private final String verCrc32;

    private final int lenVerCrc32;

    private final String rpasId;

    private final int lenRpasId;

    private final String rpasModelId;

    private final int lenRpasModelId;

    private final String uin;

    private final int lenUin;

    private NpntRfmDetail(int targetSystem, int targetComponent, String ver, int lenVer,
            String verCrc32, int lenVerCrc32, String rpasId, int lenRpasId, String rpasModelId,
            int lenRpasModelId, String uin, int lenUin) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.ver = ver;
        this.lenVer = lenVer;
        this.verCrc32 = verCrc32;
        this.lenVerCrc32 = lenVerCrc32;
        this.rpasId = rpasId;
        this.lenRpasId = lenRpasId;
        this.rpasModelId = rpasModelId;
        this.lenRpasModelId = lenRpasModelId;
        this.uin = uin;
        this.lenUin = lenUin;
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
     * Version of RFM code 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 10,
            description = "Version of RFM code"
    )
    public final String ver() {
        return this.ver;
    }

    /**
     * Version of RFM code length 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "Version of RFM code length"
    )
    public final int lenVer() {
        return this.lenVer;
    }

    /**
     * CRC32 Hash of version 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 10,
            description = "CRC32 Hash of version"
    )
    public final String verCrc32() {
        return this.verCrc32;
    }

    /**
     * CRC32 Hash of version length 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            description = "CRC32 Hash of version length"
    )
    public final int lenVerCrc32() {
        return this.lenVerCrc32;
    }

    /**
     * RPAS ID or Drone ID 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            arraySize = 20,
            description = "RPAS ID or Drone ID"
    )
    public final String rpasId() {
        return this.rpasId;
    }

    /**
     * RPAS ID or Drone ID lenght 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1,
            description = "RPAS ID or Drone ID lenght"
    )
    public final int lenRpasId() {
        return this.lenRpasId;
    }

    /**
     * RPAS model number as per DGCA 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 1,
            arraySize = 20,
            description = "RPAS model number as per DGCA"
    )
    public final String rpasModelId() {
        return this.rpasModelId;
    }

    /**
     * RPAS model number as per DGCA length 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 1,
            description = "RPAS model number as per DGCA length"
    )
    public final int lenRpasModelId() {
        return this.lenRpasModelId;
    }

    /**
     * RPAS UIN 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 1,
            arraySize = 10,
            description = "RPAS UIN"
    )
    public final String uin() {
        return this.uin;
    }

    /**
     * RPAS UIN length 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 1,
            description = "RPAS UIN length"
    )
    public final int lenUin() {
        return this.lenUin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        NpntRfmDetail other = (NpntRfmDetail)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(ver, other.ver)) return false;
        if (!Objects.deepEquals(lenVer, other.lenVer)) return false;
        if (!Objects.deepEquals(verCrc32, other.verCrc32)) return false;
        if (!Objects.deepEquals(lenVerCrc32, other.lenVerCrc32)) return false;
        if (!Objects.deepEquals(rpasId, other.rpasId)) return false;
        if (!Objects.deepEquals(lenRpasId, other.lenRpasId)) return false;
        if (!Objects.deepEquals(rpasModelId, other.rpasModelId)) return false;
        if (!Objects.deepEquals(lenRpasModelId, other.lenRpasModelId)) return false;
        if (!Objects.deepEquals(uin, other.uin)) return false;
        if (!Objects.deepEquals(lenUin, other.lenUin)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(ver);
        result = 31 * result + Objects.hashCode(lenVer);
        result = 31 * result + Objects.hashCode(verCrc32);
        result = 31 * result + Objects.hashCode(lenVerCrc32);
        result = 31 * result + Objects.hashCode(rpasId);
        result = 31 * result + Objects.hashCode(lenRpasId);
        result = 31 * result + Objects.hashCode(rpasModelId);
        result = 31 * result + Objects.hashCode(lenRpasModelId);
        result = 31 * result + Objects.hashCode(uin);
        result = 31 * result + Objects.hashCode(lenUin);
        return result;
    }

    @Override
    public String toString() {
        return "NpntRfmDetail{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", ver=" + ver
                 + ", lenVer=" + lenVer
                 + ", verCrc32=" + verCrc32
                 + ", lenVerCrc32=" + lenVerCrc32
                 + ", rpasId=" + rpasId
                 + ", lenRpasId=" + lenRpasId
                 + ", rpasModelId=" + rpasModelId
                 + ", lenRpasModelId=" + lenRpasModelId
                 + ", uin=" + uin
                 + ", lenUin=" + lenUin + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private String ver;

        private int lenVer;

        private String verCrc32;

        private int lenVerCrc32;

        private String rpasId;

        private int lenRpasId;

        private String rpasModelId;

        private int lenRpasModelId;

        private String uin;

        private int lenUin;

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
         * Version of RFM code 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 10,
                description = "Version of RFM code"
        )
        public final Builder ver(String ver) {
            this.ver = ver;
            return this;
        }

        /**
         * Version of RFM code length 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "Version of RFM code length"
        )
        public final Builder lenVer(int lenVer) {
            this.lenVer = lenVer;
            return this;
        }

        /**
         * CRC32 Hash of version 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 10,
                description = "CRC32 Hash of version"
        )
        public final Builder verCrc32(String verCrc32) {
            this.verCrc32 = verCrc32;
            return this;
        }

        /**
         * CRC32 Hash of version length 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                description = "CRC32 Hash of version length"
        )
        public final Builder lenVerCrc32(int lenVerCrc32) {
            this.lenVerCrc32 = lenVerCrc32;
            return this;
        }

        /**
         * RPAS ID or Drone ID 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                arraySize = 20,
                description = "RPAS ID or Drone ID"
        )
        public final Builder rpasId(String rpasId) {
            this.rpasId = rpasId;
            return this;
        }

        /**
         * RPAS ID or Drone ID lenght 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                description = "RPAS ID or Drone ID lenght"
        )
        public final Builder lenRpasId(int lenRpasId) {
            this.lenRpasId = lenRpasId;
            return this;
        }

        /**
         * RPAS model number as per DGCA 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 1,
                arraySize = 20,
                description = "RPAS model number as per DGCA"
        )
        public final Builder rpasModelId(String rpasModelId) {
            this.rpasModelId = rpasModelId;
            return this;
        }

        /**
         * RPAS model number as per DGCA length 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 1,
                description = "RPAS model number as per DGCA length"
        )
        public final Builder lenRpasModelId(int lenRpasModelId) {
            this.lenRpasModelId = lenRpasModelId;
            return this;
        }

        /**
         * RPAS UIN 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 1,
                arraySize = 10,
                description = "RPAS UIN"
        )
        public final Builder uin(String uin) {
            this.uin = uin;
            return this;
        }

        /**
         * RPAS UIN length 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 1,
                description = "RPAS UIN length"
        )
        public final Builder lenUin(int lenUin) {
            this.lenUin = lenUin;
            return this;
        }

        public final NpntRfmDetail build() {
            return new NpntRfmDetail(targetSystem, targetComponent, ver, lenVer, verCrc32, lenVerCrc32, rpasId, lenRpasId, rpasModelId, lenRpasModelId, uin, lenUin);
        }
    }
}
