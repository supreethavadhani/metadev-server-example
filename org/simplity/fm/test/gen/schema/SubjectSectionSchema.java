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
 * class that represents structure of subjectSection
 */ 
public class SubjectSectionSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("sectionId", 3, DefinedDataTypes.id, "0", null, null, "section_id", ColumnType.RequiredData), 
			new DbField("subjectId", 4, DefinedDataTypes.id, null, null, null, "subject_id", ColumnType.RequiredData), 
			new DbField("levelSectionId", 5, DefinedDataTypes.id, "0", null, null, "level_section_id", ColumnType.OptionalData), 
			new DbField("seasonId", 6, DefinedDataTypes.id, null, null, null, "season_id", ColumnType.RequiredData), 
			new DbField("totalClasses", 7, DefinedDataTypes.integer, "0", null, null, "total_classes", ColumnType.OptionalData), 
			new DbField("attendanceFrozen", 8, DefinedDataTypes.bool, "false", null, null, "attendance_frozen", ColumnType.OptionalData), 
			new DbField("cieFrozen", 9, DefinedDataTypes.bool, "false", null, null, "cie_frozen", ColumnType.OptionalData), 
			new DbField("createdAt", 10, DefinedDataTypes.timestamp, null, null, null, "created_at", ColumnType.CreatedAt), 
			new DbField("updatedAt", 11, DefinedDataTypes.timestamp, null, null, null, "updated_at", ColumnType.ModifiedAt)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_section_id, institute_id, offered_subject_id, section_id, subject_id, level_section_id, season_id, total_classes, attendance_frozen, cie_frozen, created_at, updated_at FROM subject_sections";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	private static final  String INSERT = "INSERT INTO subject_sections(institute_id, offered_subject_id, section_id, subject_id, level_section_id, season_id, total_classes, attendance_frozen, cie_frozen, created_at, updated_at) values (?, ?, ?, ?, ?, ?, ?, ?, ?,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP )";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE subject_section_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_sections SET offered_subject_id= ? , section_id= ? , subject_id= ? , level_section_id= ? , season_id= ? , total_classes= ? , attendance_frozen= ? , cie_frozen= ? , updated_at= CURRENT_TIMESTAMP  WHERE subject_section_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
	private static final String DELETE = "DELETE FROM subject_sections";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectSectionSchema() {
		this.name = "subjectSection";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_sections";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(12, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_section_id", 0, null);
		this.initialize();
	}

	@Override
	public SubjectSectionData newSchemaData() {
		return new SubjectSectionData(this, null);
	}

	@Override
	protected SubjectSectionData newSchemaData(final Object[] data) {
		return new SubjectSectionData(this, data);
	}

	@Override
	public SubjectSectionData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectSectionData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectSectionData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectSectionData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectSectionDataTable newSchemaDataTable() {
		return new SubjectSectionDataTable(this, null);
	}

	@Override
	protected SubjectSectionDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectSectionDataTable(this, data);
	}

	@Override
	public SubjectSectionDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectSectionDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
