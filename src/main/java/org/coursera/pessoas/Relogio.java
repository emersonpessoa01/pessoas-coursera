package org.coursera.pessoas;

public class Relogio {
    private long fixedTime = 0;

    public long agora() {
        if (fixedTime != 0) {
            return fixedTime;
        }
        return System.currentTimeMillis();
    }

    public void setFixedTime(long fixedTime) {
        this.fixedTime = fixedTime;
    }
}

