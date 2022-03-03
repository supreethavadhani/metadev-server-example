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
 * class that represents structure of registeredStudentList
 */ 
public class RegisteredStudentListSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("subjectSectionId", 1, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.RequiredData), 
			new DbField("studentId", 2, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, subject_section_id, student_id FROM registered_students_list";
	private static final int[] SELECT_IDX = {0, 1, 2};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public RegisteredStudentListSchema() {
		this.name = "registeredStudentList";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "registered_students_list";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(3, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public RegisteredStudentListData newSchemaData() {
		return new RegisteredStudentListData(this, null);
	}

	@Override
	protected RegisteredStudentListData newSchemaData(final Object[] data) {
		return new RegisteredStudentListData(this, data);
	}

	@Override
	public RegisteredStudentListData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (RegisteredStudentListData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public RegisteredStudentListData parseKeys(JsonObject json, IServiceContext ctx) {
		return (RegisteredStudentListData) super.parseKeys(json, ctx);
	}

	@Override
	public RegisteredStudentListDataTable newSchemaDataTable() {
		return new RegisteredStudentListDataTable(this, null);
	}

	@Override
	protected RegisteredStudentListDataTable newSchemaDataTable(final Object[][] data) {
		return new RegisteredStudentListDataTable(this, data);
	}

	@Override
	public RegisteredStudentListDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (RegisteredStudentListDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
