package util;

public abstract class Bean {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 在使用之前，从数据库调取数据之后要调用这个方法来初始化每个对象所直接映射到的其他元素
     * @return 返回该对象本身
     */
    public abstract Bean init();
}
