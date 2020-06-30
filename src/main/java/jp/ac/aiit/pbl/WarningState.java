package jp.ac.aiit.pbl;

public enum WarningState {
    ISSUE(1, "発表"),
    CANCEL(2, "解除");

    private final int id;
    private final String warningStateName;

    WarningState(final int id, final String warningStateName) {
        this.id = id;
        this.warningStateName = warningStateName;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return warningStateName;
    }

    public static WarningState getById(int id) {
        if(id == 1) {
            return ISSUE;
        } else {
            return CANCEL;
        }
    }
}
