package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of answerPacket
 */ 
public class AnswerPacketData extends SchemaData {

	protected AnswerPacketData(final AnswerPacketSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected AnswerPacketData newInstance(final Object[] arr) {
		return new AnswerPacketData((AnswerPacketSchema) this.schema, arr);
	}

	/**
	 * set value for packetId
	 * @param value to be assigned to packetId
	 */
	public void setPacketId(String value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of packetId
	 */
	public String getPacketId(){
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
	 * set value for evaluatorId
	 * @param value to be assigned to evaluatorId
	 */
	public void setEvaluatorId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of evaluatorId
	 */
	public long getEvaluatorId(){
		return super.getLongValue(5);
	}
}
