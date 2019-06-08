package com.hcf.helpClass;

import java.util.List;

public class SuccessAndRepeat<T> {

    public int repeatSize;
    public List<T> repeat;
    public int successSize;
    public List<T> success;

    public int getRepeatSize() {
        return repeatSize;
    }

    public void setRepeatSize(int repeatSize) {
        this.repeatSize = repeatSize;
    }

    public List<T> getRepeat() {
        return repeat;
    }

    public void setRepeat(List<T> repeat) {
        this.repeat = repeat;
        this.repeatSize = repeat.size();
    }

    public int getSuccessSize() {
        return successSize;
    }

    public void setSuccessSize(int successSize) {
        this.successSize = successSize;
    }

    public List<T> getSuccess() {
        return success;
    }

    public void setSuccess(List<T> success) {
        this.successSize = success.size();
        this.success = success;
    }

}
