package assignments.q3;

import assignments.q2.Product;

import java.util.Objects;

public class Members implements Comparable<Members>{
    //Create the additional Members class in the above LibraryManagement System
    //memberId(unique),memberName,membershipNo(unique), membershipEnddate.
    //Add a minimum of 5 members from the Main class. It should not accept duplicate
    //members, that is members having the same memberId or membershipNo.
    private int memberId;
    private String memberName;
    private int membershipNo;
    private int membershipEndDate;

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMembershipNo() {
        return membershipNo;
    }

    public void setMembershipNo(int membershipNo) {
        this.membershipNo = membershipNo;
    }

    public int getMembershipEndDate() {
        return membershipEndDate;
    }

    public void setMembershipEndDate(int membershipEndDate) {
        this.membershipEndDate = membershipEndDate;
    }

    public Members(int memberId, String memberName, int membershipNo, int membershipEndDate) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.membershipNo = membershipNo;
        this.membershipEndDate = membershipEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Members members = (Members) o;
        return memberId == members.memberId && membershipNo == members.membershipNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId, membershipNo);
    }

    @Override
    public String toString() {
        return "Members{" +
                "memberId=" + memberId +
                ", memberName='" + memberName + '\'' +
                ", membershipNo=" + membershipNo +
                ", membershipEndDate=" + membershipEndDate +
                '}';
    }

    @Override
    public int compareTo(Members o) {
        if(this.memberId==o.memberId && this.membershipNo==o.membershipNo){
            return 0;
        }else if(this.membershipEndDate>o.membershipEndDate){
            return 1;
        }
        return -1;
    }
}
