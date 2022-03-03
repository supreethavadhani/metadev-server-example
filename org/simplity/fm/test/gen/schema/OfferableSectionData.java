package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.SchemaData;
import java.time.Instant;
import java.time.LocalDate;

/**
 * class that represents structure of offerableSection
 */ 
public class OfferableSectionData extends SchemaData {

	protected OfferableSectionData(final OfferableSectionSchema schema, final Object[] data) {
		super(schema, data);
	}

	@Override
	protected OfferableSectionData newInstance(final Object[] arr) {
		return new OfferableSectionData((OfferableSectionSchema) this.schema, arr);
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
	 * set value for sectionId
	 * @param value to be assigned to sectionId
	 */
	public void setSectionId(long value){
		this.fieldValues[1] = value;
	}

	/**
	 * @return value of sectionId
	 */
	public long getSectionId(){
		return super.getLongValue(1);
	}

	/**
	 * set value for instituteId
	 * @param value to be assigned to instituteId
	 */
	public void setInstituteId(long value){
		this.fieldValues[2] = value;
	}

	/**
	 * @return value of instituteId
	 */
	public long getInstituteId(){
		return super.getLongValue(2);
	}

	/**
	 * set value for levelId
	 * @param value to be assigned to levelId
	 */
	public void setLevelId(long value){
		this.fieldValues[3] = value;
	}

	/**
	 * @return value of levelId
	 */
	public long getLevelId(){
		return super.getLongValue(3);
	}

	/**
	 * set value for name
	 * @param value to be assigned to name
	 */
	public void setName(String value){
		this.fieldValues[4] = value;
	}

	/**
	 * @return value of name
	 */
	public String getName(){
		return super.getStringValue(4);
	}

	/**
	 * set value for subjectSectionId
	 * @param value to be assigned to subjectSectionId
	 */
	public void setSubjectSectionId(long value){
		this.fieldValues[5] = value;
	}

	/**
	 * @return value of subjectSectionId
	 */
	public long getSubjectSectionId(){
		return super.getLongValue(5);
	}

	/**
	 * set value for nbrEnrolled
	 * @param value to be assigned to nbrEnrolled
	 */
	public void setNbrEnrolled(long value){
		this.fieldValues[6] = value;
	}

	/**
	 * @return value of nbrEnrolled
	 */
	public long getNbrEnrolled(){
		return super.getLongValue(6);
	}

	/**
	 * set value for canBeWithdrawn
	 * @param value to be assigned to canBeWithdrawn
	 */
	public void setCanBeWithdrawn(boolean value){
		this.fieldValues[7] = value;
	}

	/**
	 * @return value of canBeWithdrawn
	 */
	public boolean getCanBeWithdrawn(){
		return super.getBoolValue(7);
	}

	/**
	 * set value for isOffered
	 * @param value to be assigned to isOffered
	 */
	public void setIsOffered(boolean value){
		this.fieldValues[8] = value;
	}

	/**
	 * @return value of isOffered
	 */
	public boolean getIsOffered(){
		return super.getBoolValue(8);
	}
}
