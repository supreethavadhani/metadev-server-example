package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of instituteConfiguration
 */ 
public class InstituteConfigurationData extends SchemaData {

	protected InstituteConfigurationData(final InstituteConfigurationSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected InstituteConfigurationData newInstance(final Object[] arr) {
		return new InstituteConfigurationData((InstituteConfigurationSchema) this.schema, arr);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for currentSeason
	 * @param value to be assigned to currentSeason
	 */
	public void setCurrentSeason(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of currentSeason
	 */
	public long getCurrentSeason(){
		return super.getLongValue(1);
	}

	/**
	 * set value for instituteTypeId
	 * @param value to be assigned to instituteTypeId
	 */
	public void setInstituteTypeId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteTypeId
	 */
	public long getInstituteTypeId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for autoSubjectRegistration
	 * @param value to be assigned to autoSubjectRegistration
	 */
	public void setAutoSubjectRegistration(boolean value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of autoSubjectRegistration
	 */
	public boolean getAutoSubjectRegistration(){
		return super.getBoolValue(3);
	}

	/**
	 * set value for autoRollOverSubjects
	 * @param value to be assigned to autoRollOverSubjects
	 */
	public void setAutoRollOverSubjects(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of autoRollOverSubjects
	 */
	public boolean getAutoRollOverSubjects(){
		return super.getBoolValue(4);
	}

	/**
	 * set value for autoRollOverEnrollment
	 * @param value to be assigned to autoRollOverEnrollment
	 */
	public void setAutoRollOverEnrollment(boolean value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of autoRollOverEnrollment
	 */
	public boolean getAutoRollOverEnrollment(){
		return super.getBoolValue(5);
	}

	/**
	 * set value for minAttendanceForEligibility
	 * @param value to be assigned to minAttendanceForEligibility
	 */
	public void setMinAttendanceForEligibility(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of minAttendanceForEligibility
	 */
	public long getMinAttendanceForEligibility(){
		return super.getLongValue(6);
	}

	/**
	 * set value for minAttendanceForExemption
	 * @param value to be assigned to minAttendanceForExemption
	 */
	public void setMinAttendanceForExemption(long value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of minAttendanceForExemption
	 */
	public long getMinAttendanceForExemption(){
		return super.getLongValue(7);
	}

	/**
	 * set value for answerPacketSeqWidth
	 * @param value to be assigned to answerPacketSeqWidth
	 */
	public void setAnswerPacketSeqWidth(long value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of answerPacketSeqWidth
	 */
	public long getAnswerPacketSeqWidth(){
		return super.getLongValue(8);
	}

	/**
	 * set value for nbrPapersPerPacket
	 * @param value to be assigned to nbrPapersPerPacket
	 */
	public void setNbrPapersPerPacket(long value){
		this.fieldValues[9] = value;
	}

	/**
	 * @return value of nbrPapersPerPacket
	 */
	public long getNbrPapersPerPacket(){
		return super.getLongValue(9);
	}

	/**
	 * set value for minMarksForAutoreval
	 * @param value to be assigned to minMarksForAutoreval
	 */
	public void setMinMarksForAutoreval(long value){
		this.fieldValues[10] = value;
	}

	/**
	 * @return value of minMarksForAutoreval
	 */
	public long getMinMarksForAutoreval(){
		return super.getLongValue(10);
	}

	/**
	 * set value for maxMarksForAuotreval
	 * @param value to be assigned to maxMarksForAuotreval
	 */
	public void setMaxMarksForAuotreval(long value){
		this.fieldValues[11] = value;
	}

	/**
	 * @return value of maxMarksForAuotreval
	 */
	public long getMaxMarksForAuotreval(){
		return super.getLongValue(11);
	}

	/**
	 * set value for acceptableMarksDeviation
	 * @param value to be assigned to acceptableMarksDeviation
	 */
	public void setAcceptableMarksDeviation(long value){
		this.fieldValues[12] = value;
	}

	/**
	 * @return value of acceptableMarksDeviation
	 */
	public long getAcceptableMarksDeviation(){
		return super.getLongValue(12);
	}
}
