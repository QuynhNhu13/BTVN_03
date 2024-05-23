package model;

public class MonHoc {
    String idMonHoc;
    String tenMonHoc;

    public MonHoc(String idMonHoc, String tenMonHoc) {
        this.idMonHoc = idMonHoc;
        this.tenMonHoc = tenMonHoc;
    }

    public String getIdMonHoc() {
        return idMonHoc;
    }

    public void setIdMonHoc(String idMonHoc) {
        this.idMonHoc = idMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public String toString() {
        return idMonHoc + " : " + tenMonHoc;
    }
    
}
