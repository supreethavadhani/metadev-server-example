package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of paperPacket
 */ 
public class PaperPacketData extends SchemaData {

	protected PaperPacketData(final PaperPacketSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected PaperPacketData newInstance(final Object[] arr) {
		return new PaperPacketData((PaperPacketSchema) this.schema, arr);
	}

	/**
	 * set value for packetCode
	 * @param value to be assigned to packetCode
	 */
	public void setPacketCode(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of packetCode
	 */
	public String getPacketCode(){
		return super.getStringValue(0);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for subjectName
	 * @param value to be assigned to subjectName
	 */
	public void setSubjectName(String value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectName
	 */
	public String getSubjectName(){
		return super.getStringValue(3);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(4);
	}

	/**
	 * set value for valuationRound
	 * @param value to be assigned to valuationRound
	 */
	public void setValuationRound(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of valuationRound
	 */
	public long getValuationRound(){
		return super.getLongValue(5);
	}

	/**
	 * set value for initialValuatorId
	 * @param value to be assigned to initialValuatorId
	 */
	public void setInitialValuatorId(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of initialValuatorId
	 */
	public long getInitialValuatorId(){
		return super.getLongValue(6);
	}

	/**
	 * set value for initialValuationDate
	 * @param value to be assigned to initialValuationDate
	 */
	public void setInitialValuationDate(LocalDate value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of initialValuationDate
	 */
	public LocalDate getInitialValuationDate(){
		return super.getDateValue(7);
	}

	/**
	 * set value for valuator2Id
	 * @param value to be assigned to valuator2Id
	 */
	public void setValuator2Id(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of valuator2Id
	 */
	public long getValuator2Id(){
		return super.getLongValue(8);
	}

	/**
	 * set value for valuation2Date
	 * @param value to be assigned to valuation2Date
	 */
	public void setValuation2Date(LocalDate value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of valuation2Date
	 */
	public LocalDate getValuation2Date(){
		return super.getDateValue(9);
	}

	/**
	 * set value for valuator3Id
	 * @param value to be assigned to valuator3Id
	 */
	public void setValuator3Id(long value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of valuator3Id
	 */
	public long getValuator3Id(){
		return super.getLongValue(10);
	}

	/**
	 * set value for valuation3Date
	 * @param value to be assigned to valuation3Date
	 */
	public void setValuation3Date(LocalDate value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of valuation3Date
	 */
	public LocalDate getValuation3Date(){
		return super.getDateValue(11);
	}
}
