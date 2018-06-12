package util;

/**
 * @see basis
 */
public abstract class Bean {

    private String type;

    /**
     * 拿到这个对象的类型名
     * @return 以字符串形式返回类型名
     */
    public String getType() {
        return type;
    }

    /**
     * 设置这个Bean对象的类型名
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 在使用之前，从数据库调取数据之后要调用这个方法来初始化每个对象所直接映射到的其他元素
     * @return 返回该对象本身
     */
    public abstract Bean init();
}
