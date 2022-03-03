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
 * class that represents structure of subjectSectionDetail
 */ 
public class SubjectSectionDetailSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, "0", null, null, "offered_subject_id", ColumnType.OptionalData), 
			new DbField("subjectId", 3, DefinedDataTypes.id, "0", null, null, "subject_id", ColumnType.OptionalData), 
			new DbField("levelSectionId", 4, DefinedDataTypes.id, "0", null, null, "level_section_id", ColumnType.OptionalData), 
			new DbField("departmentId", 5, DefinedDataTypes.id, null, null, null, "department_id", ColumnType.OptionalData), 
			new DbField("sectionId", 6, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.OptionalData), 
			new DbField("subjectName", 7, DefinedDataTypes.name, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("sectionName", 8, DefinedDataTypes.name, null, null, null, "section_name", ColumnType.OptionalData), 
			new DbField("totalClasses", 9, DefinedDataTypes.integer, null, null, null, "total_classes", ColumnType.OptionalData), 
			new DbField("attendanceFrozen", 10, DefinedDataTypes.bool, "false", null, null, "attendance_frozen", ColumnType.OptionalData), 
			new DbField("cieFrozen", 11, DefinedDataTypes.bool, "false", null, null, "cie_frozen", ColumnType.OptionalData), 
			new DbField("isOffered", 12, DefinedDataTypes.bool, "false", null, null, "is_offered", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, false, true, false};
	private static final String SELECT = "SELECT subject_section_id, institute_id, offered_subject_id, subject_id, level_section_id, department_id, section_id, subject_name, section_name, total_classes, attendance_frozen, cie_frozen, is_offered FROM subject_section_details";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static final  String INSERT = "INSERT INTO subject_section_details(subject_section_id, institute_id, offered_subject_id, subject_id, level_section_id, department_id, section_id, subject_name, section_name, total_classes, attendance_frozen, cie_frozen, is_offered) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private static final String WHERE = " WHERE subject_section_id=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE subject_section_details SET offered_subject_id= ? , subject_id= ? , level_section_id= ? , department_id= ? , section_id= ? , subject_name= ? , section_name= ? , total_classes= ? , attendance_frozen= ? , cie_frozen= ? , is_offered= ?  WHERE subject_section_id=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 1};
	private static final String DELETE = "DELETE FROM subject_section_details";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public SubjectSectionDetailSchema() {
		this.name = "subjectSectionDetail";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "subject_section_details";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(13, this.fields[1], SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public SubjectSectionDetailData newSchemaData() {
		return new SubjectSectionDetailData(this, null);
	}

	@Override
	protected SubjectSectionDetailData newSchemaData(final Object[] data) {
		return new SubjectSectionDetailData(this, data);
	}

	@Override
	public SubjectSectionDetailData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (SubjectSectionDetailData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public SubjectSectionDetailData parseKeys(JsonObject json, IServiceContext ctx) {
		return (SubjectSectionDetailData) super.parseKeys(json, ctx);
	}

	@Override
	public SubjectSectionDetailDataTable newSchemaDataTable() {
		return new SubjectSectionDetailDataTable(this, null);
	}

	@Override
	protected SubjectSectionDetailDataTable newSchemaDataTable(final Object[][] data) {
		return new SubjectSectionDetailDataTable(this, data);
	}

	@Override
	public SubjectSectionDetailDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (SubjectSectionDetailDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
