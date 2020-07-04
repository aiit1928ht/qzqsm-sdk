package jp.ac.aiit.pbl;

public class AshFallTimeWarningCodeLocalGovernment {
        public final int expectedAshFall;
        public final WarningCode warningCode;
        public final LocalGovernment  localGovernment;

        AshFallTimeWarningCodeLocalGovernment(int expectedAshFall, int warningCodeId, int localGovernmentId) {
            this.expectedAshFall=expectedAshFall;
            this.warningCode = WarningCode.getById(warningCodeId);
            this.localGovernment = LocalGovernment.getById(localGovernmentId);
        }

        public int getExpectedAshFall() {
            return expectedAshFall;
        }

        public WarningCode getWarningCode() {
            return warningCode;
        }

        public LocalGovernment getLocalGovernment() {
            return localGovernment;
        }

    @Override
    public String toString() {
        return "AshFallTimeWarningCodeLocalGovernment{" +
                "expectedAshFall=" + expectedAshFall +
                ", warningCode=" + warningCode +
                ", localGovernment=" + localGovernment +
                '}';
    }
}
