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
 * class that represents structure of registerableStudent
 */ 
public class RegisterableStudentSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("studentId", 0, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("name", 1, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 2, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("department", 3, DefinedDataTypes.name, null, null, null, "department", ColumnType.OptionalData), 
			new DbField("isRegistered", 4, DefinedDataTypes.bool, "false", null, null, "is_registered", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT student_id, name, usn, department, is_registered FROM registerable_students";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public RegisterableStudentSchema() {
		this.name = "registerableStudent";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "registerable_students";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, null, SELECT, this.getParams(SELECT_IDX));
		this.initialize();
	}

	@Override
	public RegisterableStudentData newSchemaData() {
		return new RegisterableStudentData(this, null);
	}

	@Override
	protected RegisterableStudentData newSchemaData(final Object[] data) {
		return new RegisterableStudentData(this, data);
	}

	@Override
	public RegisterableStudentData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (RegisterableStudentData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public RegisterableStudentData parseKeys(JsonObject json, IServiceContext ctx) {
		return (RegisterableStudentData) super.parseKeys(json, ctx);
	}

	@Override
	public RegisterableStudentDataTable newSchemaDataTable() {
		return new RegisterableStudentDataTable(this, null);
	}

	@Override
	protected RegisterableStudentDataTable newSchemaDataTable(final Object[][] data) {
		return new RegisterableStudentDataTable(this, data);
	}

	@Override
	public RegisterableStudentDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (RegisterableStudentDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
