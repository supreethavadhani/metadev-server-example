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
 * class that represents structure of integratedCie
 */ 
public class IntegratedCieSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectRegisterId", 0, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.PrimaryKey), 
			new DbField("studentId", 1, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.OptionalData), 
			new DbField("name", 2, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 3, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData), 
			new DbField("cieMarks", 4, DefinedDataTypes.integer, "0", null, null, "cie_marks", ColumnType.OptionalData), 
			new DbField("theoryCieMarks", 5, DefinedDataTypes.integer, null, null, null, null, ColumnType.OptionalData), 
			new DbField("labCieMarks", 6, DefinedDataTypes.integer, null, null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {false, false, false, false, true, false};
	private static final String SELECT = "SELECT subject_register_id, student_id, name, usn, cie_marks, null, null FROM student_in_registers";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final  String INSERT = "INSERT INTO student_in_registers(subject_register_id, student_id, name, usn, cie_marks, null, null) values (?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6};
	private static final String WHERE = " WHERE subject_register_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE student_in_registers SET student_id= ? , name= ? , usn= ? , cie_marks= ? , null= ? , null= ?  WHERE subject_register_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 5, 6, 0};
	private static final String DELETE = "DELETE FROM student_in_registers";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public IntegratedCieSchema() {
		this.name = "integratedCie";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "student_in_registers";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(7, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public IntegratedCieData newSchemaData() {
		return new IntegratedCieData(this, null);
	}

	@Override
	protected IntegratedCieData newSchemaData(final Object[] data) {
		return new IntegratedCieData(this, data);
	}

	@Override
	public IntegratedCieData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (IntegratedCieData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public IntegratedCieData parseKeys(JsonObject json, IServiceContext ctx) {
		return (IntegratedCieData) super.parseKeys(json, ctx);
	}

	@Override
	public IntegratedCieDataTable newSchemaDataTable() {
		return new IntegratedCieDataTable(this, null);
	}

	@Override
	protected IntegratedCieDataTable newSchemaDataTable(final Object[][] data) {
		return new IntegratedCieDataTable(this, data);
	}

	@Override
	public IntegratedCieDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (IntegratedCieDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
