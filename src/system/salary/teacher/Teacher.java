package system.salary.teacher;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 20:00 2019-05-21
 */
public class Teacher {

    /**
     * 教师号
     */
    private int id;

    /**
     * 教师姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 工作单位
     */
    private String workUnit;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 联系电话
     */
    private Long phoneNumber;

    /**
     * 基本工资
     */
    private Long baseSalary;

    /**
     * 津贴
     */
    private Long benefit;

    /**
     * 生活补贴
     */
    private Long livingAllowance;

    /**
     * 应发工资
     */
    private int payable;

    /**
     * 电话费
     */
    private int telephoneFee;

    /**
     * 水电费
     */
    private int utilityFee;


    /**
     * 房租
     */
    private int rent;

    /**
     * 所得税
     */
    private int incomeTax;

    /**
     * 卫生费
     */
    private int hygieneFee;

    /**
     * 公积金
     */
    private int providentFund;

    /**
     * 合计扣款
     */
    private int totalDeduction;

    /**
     * 实发工资
     */
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Long baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Long getBenefit() {
        return benefit;
    }

    public void setBenefit(Long benefit) {
        this.benefit = benefit;
    }

    public Long getLivingAllowance() {
        return livingAllowance;
    }

    public void setLivingAllowance(Long livingAllowance) {
        this.livingAllowance = livingAllowance;
    }

    public int getPayable() {
        return payable;
    }

    public void setPayable(int payable) {
        this.payable = payable;
    }

    public int getTelephoneFee() {
        return telephoneFee;
    }

    public void setTelephoneFee(int telephoneFee) {
        this.telephoneFee = telephoneFee;
    }

    public int getUtilityFee() {
        return utilityFee;
    }

    public void setUtilityFee(int utilityFee) {
        this.utilityFee = utilityFee;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(int incomeTax) {
        this.incomeTax = incomeTax;
    }

    public int getHygieneFee() {
        return hygieneFee;
    }

    public void setHygieneFee(int hygieneFee) {
        this.hygieneFee = hygieneFee;
    }

    public int getProvidentFund() {
        return providentFund;
    }

    public void setProvidentFund(int providentFund) {
        this.providentFund = providentFund;
    }

    public int getTotalDeduction() {
        return totalDeduction;
    }

    public void setTotalDeduction(int totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
