package tr.courses.kafkaconsumer.model;
public class Order {
    private String item;
    private String deliveryType;
    private long quatity;

    public Order(String item, String deliveryType, long quatity) {
        this.item = item;
        this.deliveryType = deliveryType;
        this.quatity = quatity;
    }

    public Order() {
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public long getQuatity() {
        return quatity;
    }

    public void setQuatity(long quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", deliveryType='" + deliveryType + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
