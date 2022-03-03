package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of levelSection
 */ 
public class LevelSectionData extends SchemaData {

	protected LevelSectionData(final LevelSectionSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected LevelSectionData newInstance(final Object[] arr) {
		return new LevelSectionData((LevelSectionSchema) this.schema, arr);
	}

	/**
	 * set value for levelSectionId
	 * @param value to be assigned to levelSectionId
	 */
	public void setLevelSectionId(long value){
		this.fieldValues[0] = value;
	}

	/**
	 * @return value of levelSectionId
	 */
	public long getLevelSectionId(){
		return super.getLongValue(0);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of levelId
	 */
	public long getLevelId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for programId
	 * @param value to be assigned to programId
	 */
	public void setProgramId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of programId
	 */
	public long getProgramId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for isActive
	 * @param value to be assigned to isActive
	 */
	public void setIsActive(boolean value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of isActive
	 */
	public boolean getIsActive(){
		return super.getBoolValue(4);
	}
}
