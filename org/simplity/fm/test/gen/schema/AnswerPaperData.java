package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of answerPaper
 */ 
public class AnswerPaperData extends SchemaData {

	protected AnswerPaperData(final AnswerPaperSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AnswerPaperData newInstance(final Object[] arr) {
		return new AnswerPaperData((AnswerPaperSchema) this.schema, arr);
	}

	/**
	 * set value for answerPaperId
	 * @param value to be assigned to answerPaperId
	 */
	public void setAnswerPaperId(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of answerPaperId
	 */
	public String getAnswerPaperId(){
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
	 * set value for packetId
	 * @param value to be assigned to packetId
	 */
	public void setPacketId(String value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of packetId
	 */
	public String getPacketId(){
		return super.getStringValue(2);
	}

	/**
	 * set value for subjectRegisterId
	 * @param value to be assigned to subjectRegisterId
	 */
	public void setSubjectRegisterId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of subjectRegisterId
	 */
	public long getSubjectRegisterId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for seasonId
	 * @param value to be assigned to seasonId
	 */
	public void setSeasonId(long value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of seasonId
	 */
	public long getSeasonId(){
		return super.getLongValue(4);
	}

	/**
	 * set value for finalMarks
	 * @param value to be assigned to finalMarks
	 */
	public void setFinalMarks(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of finalMarks
	 */
	public long getFinalMarks(){
		return super.getLongValue(5);
	}

	/**
	 * set value for finalResult
	 * @param value to be assigned to finalResult
	 */
	public void setFinalResult(String value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of finalResult
	 */
	public String getFinalResult(){
		return super.getStringValue(6);
	}

	/**
	 * set value for listedMarks
	 * @param value to be assigned to listedMarks
	 */
	public void setListedMarks(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of listedMarks
	 */
	public long getListedMarks(){
		return super.getLongValue(7);
	}

	/**
	 * set value for evaluator1Id
	 * @param value to be assigned to evaluator1Id
	 */
	public void setEvaluator1Id(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of evaluator1Id
	 */
	public long getEvaluator1Id(){
		return super.getLongValue(8);
	}

	/**
	 * set value for marks1
	 * @param value to be assigned to marks1
	 */
	public void setMarks1(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of marks1
	 */
	public long getMarks1(){
		return super.getLongValue(9);
	}

	/**
	 * set value for requires2
	 * @param value to be assigned to requires2
	 */
	public void setRequires2(boolean value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of requires2
	 */
	public boolean getRequires2(){
		return super.getBoolValue(10);
	}

	/**
	 * set value for isModerated
	 * @param value to be assigned to isModerated
	 */
	public void setIsModerated(boolean value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of isModerated
	 */
	public boolean getIsModerated(){
		return super.getBoolValue(11);
	}

	/**
	 * set value for evaluator2Id
	 * @param value to be assigned to evaluator2Id
	 */
	public void setEvaluator2Id(long value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of evaluator2Id
	 */
	public long getEvaluator2Id(){
		return super.getLongValue(12);
	}

	/**
	 * set value for marks2
	 * @param value to be assigned to marks2
	 */
	public void setMarks2(long value){
		this.fieldValues[13] = value;
	}

	/**
	 * @return value of marks2
	 */
	public long getMarks2(){
		return super.getLongValue(13);
	}

	/**
	 * set value for requires3
	 * @param value to be assigned to requires3
	 */
	public void setRequires3(boolean value){
		this.fieldValues[14] = value;
	}

	/**
	 * @return value of requires3
	 */
	public boolean getRequires3(){
		return super.getBoolValue(14);
	}

	/**
	 * set value for evaluator3Id
	 * @param value to be assigned to evaluator3Id
	 */
	public void setEvaluator3Id(long value){
		this.fieldValues[15] = value;
	}

	/**
	 * @return value of evaluator3Id
	 */
	public long getEvaluator3Id(){
		return super.getLongValue(15);
	}

	/**
	 * set value for marks3
	 * @param value to be assigned to marks3
	 */
	public void setMarks3(long value){
		this.fieldValues[16] = value;
	}

	/**
	 * @return value of marks3
	 */
	public long getMarks3(){
		return super.getLongValue(16);
	}

	/**
	 * set value for eligibleForReval
	 * @param value to be assigned to eligibleForReval
	 */
	public void setEligibleForReval(boolean value){
		this.fieldValues[17] = value;
	}

	/**
	 * @return value of eligibleForReval
	 */
	public boolean getEligibleForReval(){
		return super.getBoolValue(17);
	}

	/**
	 * set value for requires4
	 * @param value to be assigned to requires4
	 */
	public void setRequires4(boolean value){
		this.fieldValues[18] = value;
	}

	/**
	 * @return value of requires4
	 */
	public boolean getRequires4(){
		return super.getBoolValue(18);
	}

	/**
	 * set value for evaluator4Id
	 * @param value to be assigned to evaluator4Id
	 */
	public void setEvaluator4Id(long value){
		this.fieldValues[19] = value;
	}

	/**
	 * @return value of evaluator4Id
	 */
	public long getEvaluator4Id(){
		return super.getLongValue(19);
	}

	/**
	 * set value for marks4
	 * @param value to be assigned to marks4
	 */
	public void setMarks4(long value){
		this.fieldValues[20] = value;
	}

	/**
	 * @return value of marks4
	 */
	public long getMarks4(){
		return super.getLongValue(20);
	}

	/**
	 * set value for requires5
	 * @param value to be assigned to requires5
	 */
	public void setRequires5(boolean value){
		this.fieldValues[21] = value;
	}

	/**
	 * @return value of requires5
	 */
	public boolean getRequires5(){
		return super.getBoolValue(21);
	}

	/**
	 * set value for evaluator5Id
	 * @param value to be assigned to evaluator5Id
	 */
	public void setEvaluator5Id(long value){
		this.fieldValues[22] = value;
	}

	/**
	 * @return value of evaluator5Id
	 */
	public long getEvaluator5Id(){
		return super.getLongValue(22);
	}

	/**
	 * set value for marks5
	 * @param value to be assigned to marks5
	 */
	public void setMarks5(long value){
		this.fieldValues[23] = value;
	}

	/**
	 * @return value of marks5
	 */
	public long getMarks5(){
		return super.getLongValue(23);
	}

	/**
	 * set value for eligibleForChallenge
	 * @param value to be assigned to eligibleForChallenge
	 */
	public void setEligibleForChallenge(boolean value){
		this.fieldValues[24] = value;
	}

	/**
	 * @return value of eligibleForChallenge
	 */
	public boolean getEligibleForChallenge(){
		return super.getBoolValue(24);
	}

	/**
	 * set value for requires6
	 * @param value to be assigned to requires6
	 */
	public void setRequires6(boolean value){
		this.fieldValues[25] = value;
	}

	/**
	 * @return value of requires6
	 */
	public boolean getRequires6(){
		return super.getBoolValue(25);
	}

	/**
	 * set value for evaluator6Id
	 * @param value to be assigned to evaluator6Id
	 */
	public void setEvaluator6Id(long value){
		this.fieldValues[26] = value;
	}

	/**
	 * @return value of evaluator6Id
	 */
	public long getEvaluator6Id(){
		return super.getLongValue(26);
	}

	/**
	 * set value for marks6
	 * @param value to be assigned to marks6
	 */
	public void setMarks6(long value){
		this.fieldValues[27] = value;
	}

	/**
	 * @return value of marks6
	 */
	public long getMarks6(){
		return super.getLongValue(27);
	}

	/**
	 * set value for requires7
	 * @param value to be assigned to requires7
	 */
	public void setRequires7(boolean value){
		this.fieldValues[28] = value;
	}

	/**
	 * @return value of requires7
	 */
	public boolean getRequires7(){
		return super.getBoolValue(28);
	}

	/**
	 * set value for evaluator7Id
	 * @param value to be assigned to evaluator7Id
	 */
	public void setEvaluator7Id(long value){
		this.fieldValues[29] = value;
	}

	/**
	 * @return value of evaluator7Id
	 */
	public long getEvaluator7Id(){
		return super.getLongValue(29);
	}

	/**
	 * set value for marks7
	 * @param value to be assigned to marks7
	 */
	public void setMarks7(long value){
		this.fieldValues[30] = value;
	}

	/**
	 * @return value of marks7
	 */
	public long getMarks7(){
		return super.getLongValue(30);
	}
}
