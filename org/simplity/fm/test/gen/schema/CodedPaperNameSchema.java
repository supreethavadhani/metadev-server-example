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
 * class that represents structure of codedPaperName
 */ 
public class CodedPaperNameSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("paperCode", 0, DefinedDataTypes.text, null, null, null, "paper_code", ColumnType.PrimaryKey), 
			new DbField("instituteId", 1, DefinedDataTypes.tenantKey, null, null, null, "institute_id", ColumnType.PrimaryKey), 
			new DbField("subjectRegisterId", 2, DefinedDataTypes.id, null, null, null, "subject_register_id", ColumnType.RequiredData), 
			new DbField("isMakeup", 3, DefinedDataTypes.bool, "false", null, null, "is_makeup", ColumnType.OptionalData), 
			new DbField("valuationRound", 4, DefinedDataTypes.integer, "0", null, null, "valuation_round", ColumnType.OptionalData), 
			new DbField("packetCode", 5, DefinedDataTypes.text, null, null, null, "packet_code", ColumnType.RequiredData), 
			new DbField("offeredSubjectId", 6, DefinedDataTypes.id, null, null, null, "offered_subject_id", ColumnType.RequiredData), 
			new DbField("studentId", 7, DefinedDataTypes.id, null, null, null, "student_id", ColumnType.RequiredData), 
			new DbField("name", 8, DefinedDataTypes.name, null, null, null, "name", ColumnType.OptionalData), 
			new DbField("usn", 9, DefinedDataTypes.text, null, null, null, "usn", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, false, false, true, false};
	private static final String SELECT = "SELECT paper_code, institute_id, subject_register_id, is_makeup, valuation_round, packet_code, offered_subject_id, student_id, name, usn FROM coded_paper_names";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final  String INSERT = "INSERT INTO coded_paper_names(paper_code, institute_id, subject_register_id, is_makeup, valuation_round, packet_code, offered_subject_id, student_id, name, usn) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private static final String WHERE = " WHERE paper_code=? AND institute_id=?";
	private static final int[] WHERE_IDX = {0, 1};
	private static final  String UPDATE = "UPDATE coded_paper_names SET subject_register_id= ? , is_makeup= ? , valuation_round= ? , packet_code= ? , offered_subject_id= ? , student_id= ? , name= ? , usn= ?  WHERE paper_code=? AND institute_id=?";
	private static final  int[] UPDATE_IDX = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
	private static final String DELETE = "DELETE FROM coded_paper_names";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CodedPaperNameSchema() {
		this.name = "codedPaperName";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "coded_paper_names";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(10, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public CodedPaperNameData newSchemaData() {
		return new CodedPaperNameData(this, null);
	}

	@Override
	protected CodedPaperNameData newSchemaData(final Object[] data) {
		return new CodedPaperNameData(this, data);
	}

	@Override
	public CodedPaperNameData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CodedPaperNameData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CodedPaperNameData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CodedPaperNameData) super.parseKeys(json, ctx);
	}

	@Override
	public CodedPaperNameDataTable newSchemaDataTable() {
		return new CodedPaperNameDataTable(this, null);
	}

	@Override
	protected CodedPaperNameDataTable newSchemaDataTable(final Object[][] data) {
		return new CodedPaperNameDataTable(this, data);
	}

	@Override
	public CodedPaperNameDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CodedPaperNameDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
