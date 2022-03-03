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
 * class that represents structure of registeredStudentName
 */ 
public class RegisteredStudentNameSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("instituteId", 0, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.TenantKey), 
			new DbField("subjectSectionId", 1, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.OptionalData), 
			new DbField("offeredSubjectId", 2, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.OptionalData), 
			new DbField("subjectRegisterId", 3, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("studentId", 4, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.OptionalData), 
			new DbField("name", 5, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 6, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("department", 7, DefinedDataTypes.name, null, null, null, "department", ColumnType.OptionalData), 
			new DbField("level", 8, DefinedDataTypes.name, null, null, null, "level", ColumnType.OptionalData), 
			new DbField("section", 9, DefinedDataTypes.name, null, null, null, "section", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT institute_id, subject_section_id, offered_subject_id, subject_register_id, student_id, name, usn, department, level, section FROM registered_student_names";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public RegisteredStudentNameSchema() {
		this.name = "registeredStudentName";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "registered_student_names";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, this.fields[0], SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public RegisteredStudentNameData newSchemaData() {
		return new RegisteredStudentNameData(this, null);
	}

	@Override
	protected RegisteredStudentNameData newSchemaData(final Object[] data) {
		return new RegisteredStudentNameData(this, data);
	}

	@Override
	public RegisteredStudentNameData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (RegisteredStudentNameData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public RegisteredStudentNameData parseKeys(JsonObject json, IServiceContext ctx) {
		return (RegisteredStudentNameData) super.parseKeys(json, ctx);
	}

	@Override
	public RegisteredStudentNameDataTable newSchemaDataTable() {
		return new RegisteredStudentNameDataTable(this, null);
	}

	@Override
	protected RegisteredStudentNameDataTable newSchemaDataTable(final Object[][] data) {
		return new RegisteredStudentNameDataTable(this, data);
	}

	@Override
	public RegisteredStudentNameDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (RegisteredStudentNameDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
