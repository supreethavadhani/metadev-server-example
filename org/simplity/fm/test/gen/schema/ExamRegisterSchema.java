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
 * class that represents structure of examRegister
 */ 
public class ExamRegisterSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("offeredSubjectId", 1, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 3, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("department", 4, DefinedDataTypes.text, null, null, null, "department", ColumnType.OptionalData), 
			new DbField("level", 5, DefinedDataTypes.text, null, null, null, "level", ColumnType.OptionalData), 
			new DbField("hasAttendedExam", 6, DefinedDataTypes.bool, null, null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT subject_register_id, offered_subject_id, name, usn, department, level, null FROM exam_registers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO exam_registers(offered_subject_id, name, usn, department, level, null) values (?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE subject_register_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE exam_registers SET offered_subject_id= ? , name= ? , usn= ? , department= ? , level= ? , null= ?  WHERE subject_register_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 5, 6, 0};
	private static final String DELETE = "DELETE FROM exam_registers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public ExamRegisterSchema() {
		this.name = "examRegister";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "exam_registers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "subject_register_id", 0, null);
		this.initialize();
	}

	@Override
	public ExamRegisterData newSchemaData() {
		return new ExamRegisterData(this, null);
	}

	@Override
	protected ExamRegisterData newSchemaData(final Object[] data) {
		return new ExamRegisterData(this, data);
	}

	@Override
	public ExamRegisterData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (ExamRegisterData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public ExamRegisterData parseKeys(JsonObject json, IServiceContext ctx) {
		return (ExamRegisterData) super.parseKeys(json, ctx);
	}

	@Override
	public ExamRegisterDataTable newSchemaDataTable() {
		return new ExamRegisterDataTable(this, null);
	}

	@Override
	protected ExamRegisterDataTable newSchemaDataTable(final Object[][] data) {
		return new ExamRegisterDataTable(this, data);
	}

	@Override
	public ExamRegisterDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (ExamRegisterDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
