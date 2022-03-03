package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of codedPaper
 */ 
public class CodedPaperData extends SchemaData {

	protected CodedPaperData(final CodedPaperSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected CodedPaperData newInstance(final Object[] arr) {
		return new CodedPaperData((CodedPaperSchema) this.schema, arr);
	}

	/**
	 * set value for paperCode
	 * @param value to be assigned to paperCode
	 */
	public void setPaperCode(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of paperCode
	 */
	public String getPaperCode(){
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
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for isMakeup
	 * @param value to be assigned to isMakeup
	 */
	public void setIsMakeup(boolean value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of isMakeup
	 */
	public boolean getIsMakeup(){
		return super.getBoolValue(3);
	}

	/**
	 * set value for valuationRound
	 * @param value to be assigned to valuationRound
	 */
	public void setValuationRound(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of valuationRound
	 */
	public long getValuationRound(){
		return super.getLongValue(4);
	}

	/**
	 * set value for packetCode
	 * @param value to be assigned to packetCode
	 */
	public void setPacketCode(String value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of packetCode
	 */
	public String getPacketCode(){
		return super.getStringValue(5);
	}

	/**
	 * set value for initialMarks
	 * @param value to be assigned to initialMarks
	 */
	public void setInitialMarks(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of initialMarks
	 */
	public long getInitialMarks(){
		return super.getLongValue(6);
	}

	/**
	 * set value for initialEvaluatorId
	 * @param value to be assigned to initialEvaluatorId
	 */
	public void setInitialEvaluatorId(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of initialEvaluatorId
	 */
	public long getInitialEvaluatorId(){
		return super.getLongValue(7);
	}

	/**
	 * set value for requires2
	 * @param value to be assigned to requires2
	 */
	public void setRequires2(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of requires2
	 */
	public boolean getRequires2(){
		return super.getBoolValue(8);
	}

	/**
	 * set value for marks2
	 * @param value to be assigned to marks2
	 */
	public void setMarks2(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of marks2
	 */
	public long getMarks2(){
		return super.getLongValue(9);
	}

	/**
	 * set value for evaluator2Id
	 * @param value to be assigned to evaluator2Id
	 */
	public void setEvaluator2Id(long value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of evaluator2Id
	 */
	public long getEvaluator2Id(){
		return super.getLongValue(10);
	}

	/**
	 * set value for requires3
	 * @param value to be assigned to requires3
	 */
	public void setRequires3(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of requires3
	 */
	public boolean getRequires3(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for marks3
	 * @param value to be assigned to marks3
	 */
	public void setMarks3(long value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of marks3
	 */
	public long getMarks3(){
		return super.getLongValue(12);
	}

	/**
	 * set value for evaluator3Id
	 * @param value to be assigned to evaluator3Id
	 */
	public void setEvaluator3Id(long value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of evaluator3Id
	 */
	public long getEvaluator3Id(){
		return super.getLongValue(13);
	}

	/**
	 * set value for effectiveMarks
	 * @param value to be assigned to effectiveMarks
	 */
	public void setEffectiveMarks(long value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of effectiveMarks
	 */
	public long getEffectiveMarks(){
		return super.getLongValue(14);
	}

	/**
	 * set value for studentId
	 * @param value to be assigned to studentId
	 */
	public void setStudentId(long value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of studentId
	 */
	public long getStudentId(){
		return super.getLongValue(15);
	}

	/**
	 * set value for offeredSubjectId
	 * @param value to be assigned to offeredSubjectId
	 */
	public void setOfferedSubjectId(long value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of offeredSubjectId
	 */
	public long getOfferedSubjectId(){
		return super.getLongValue(16);
	}
}
