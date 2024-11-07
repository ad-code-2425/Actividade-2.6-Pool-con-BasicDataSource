package edu.cdm.pool.model;


/**
 *
 * @author maria
 */
public class Departamento {

    Integer deptno;
    String deptName;
    String loc;

    public Departamento(Integer deptno, String deptName, String loc) {
        this.deptno = deptno;
        this.deptName = deptName;
        this.loc = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

}
