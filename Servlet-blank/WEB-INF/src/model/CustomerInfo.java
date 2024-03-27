package model;

public class CustomerInfo {
    private int customerId;
    private String customerName;
    private String sex;
    private String birthday;
    private String email;
    private String address;
    private String deleteYmd;
    private String insertYmd;
    private int insertPsnCd;
    private String updateYmd;
    private int updatePsnCd;

    public CustomerInfo(int customerId, String customerName, String sex, String birthday, String email, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
    }

    // Getter and setter methods for each attribute
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeleteYmd() {
        return deleteYmd;
    }

    public void setDeleteYmd(String deleteYmd) {
        this.deleteYmd = deleteYmd;
    }

    public String getInsertYmd() {
        return insertYmd;
    }

    public void setInsertYmd(String insertYmd) {
        this.insertYmd = insertYmd;
    }

    public int getInsertPsnCd() {
        return insertPsnCd;
    }

    public void setInsertPsnCd(int insertPsnCd) {
        this.insertPsnCd = insertPsnCd;
    }

    public String getUpdateYmd() {
        return updateYmd;
    }

    public void setUpdateYmd(String updateYmd) {
        this.updateYmd = updateYmd;
    }

    public int getUpdatePsnCd() {
        return updatePsnCd;
    }

    public void setUpdatePsnCd(int updatePsnCd) {
        this.updatePsnCd = updatePsnCd;
    }
}
