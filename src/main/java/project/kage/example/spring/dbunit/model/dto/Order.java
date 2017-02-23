package project.kage.example.spring.dbunit.model.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author papa
 *
 */
@Entity(name = "t_order")
public class Order {
	/** 注文ID */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	/** 会社コード */
	private String companyCode;
	/** 注文情報 */
	private String orderInfomation;
	/** 登録ユーザーID */
	private String createUserId;
	/** 登録タイムスタンプ */
	private Timestamp createDateTime;
	/** 更新ユーザーID */
	private String updateUserId;
	/** 更新タイムスタンプ */
	private Timestamp updateDateTime;
	/** バージョンNO */
	private Integer versionNumber;
	/** 論理削除フラグ */
	private Boolean logicalDeleteFlag;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getOrderInfomation() {
		return orderInfomation;
	}

	public void setOrderInfomation(String orderInfomation) {
		this.orderInfomation = orderInfomation;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Timestamp getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Timestamp createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Integer getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(Integer versionNumber) {
		this.versionNumber = versionNumber;
	}

	public Boolean getLogicalDeleteFlag() {
		return logicalDeleteFlag;
	}

	public void setLogicalDeleteFlag(Boolean logicalDeleteFlag) {
		this.logicalDeleteFlag = logicalDeleteFlag;
	}

}
