package org.simplity.fm.test.gen.schema;

import org.simplity.fm.core.data.DbField;
import org.simplity.fm.core.data.Schema;
import org.simplity.fm.core.validn.IValidation;
import org.simplity.fm.core.data.DbAssistant;
import org.simplity.fm.core.service.IServiceContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import org.simplity.fm.core.data.ColumnType;
import org.simplity.fm.core.validn.DependentListValidation;
import org.simplity.fm.test.gen.DefinedDataTypes;

/**
 * class that represents structure of offerableSection
 */ 
public class OfferableSectionSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("levelSectionId", 0, DefinedDataTypes.id, null, null, null, "level_section_id", ColumnType.RequiredData), 
			new DbField("sectionId", 1, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.RequiredData), 
			new DbField("instituteId", 2, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("levelId", 3, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.OptionalData), 
			new DbField("name", 4, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("subjectSectionId", 5, DefinedDataTypes.id, "0", null, null, "subject_section_id", ColumnType.OptionalData), 
			new DbField("nbrEnrolled", 6, DefinedDataTypes.integer, "0", null, null, "nbr_enrolled", ColumnType.OptionalData), 
			new DbField("canBeWithdrawn", 7, DefinedDataTypes.bool, "true", null, null, "can_be_withdrawn", ColumnType.OptionalData), 
			new DbField("isOffered", 8, DefinedDataTypes.bool, "false", null, null, "is_offered", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT level_section_id, section_id, institute_id, level_id, name, subject_section_id, nbr_enrolled, can_be_withdrawn, is_offered FROM offerable_sections";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public OfferableSectionSchema() {
		this.name = "offerableSection";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "offerable_sections";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(9, this.fields[2], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public OfferableSectionData newSchemaData() {
		return new OfferableSectionData(this, null);
	}

	@Override
	protected OfferableSectionData newSchemaData(final Object[] data) {
		return new OfferableSectionData(this, data);
	}

	@Override
	public OfferableSectionData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (OfferableSectionData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public OfferableSectionData parseKeys(JsonObject json, IServiceContext ctx) {
		return (OfferableSectionData) super.parseKeys(json, ctx);
	}

	@Override
	public OfferableSectionDataTable newSchemaDataTable() {
		return new OfferableSectionDataTable(this, null);
	}

	@Override
	protected OfferableSectionDataTable newSchemaDataTable(final Object[][] data) {
		return new OfferableSectionDataTable(this, data);
	}

	@Override
	public OfferableSectionDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (OfferableSectionDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
