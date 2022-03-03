package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of answerPaperInitial
 */ 
public class AnswerPaperInitialData extends SchemaData {

	protected AnswerPaperInitialData(final AnswerPaperInitialSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AnswerPaperInitialData newInstance(final Object[] arr) {
		return new AnswerPaperInitialData((AnswerPaperInitialSchema) this.schema, arr);
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
}
