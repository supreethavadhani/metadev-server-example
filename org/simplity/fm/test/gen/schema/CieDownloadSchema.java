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
 * class that represents structure of cieDownload
 */ 
public class CieDownloadSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("subjectSectionId", 0, DefinedDataTypes.id, null, null, null, "subject_section_id", ColumnType.PrimaryKey), 
			new DbField("offeredSubjectId", 1, DefinedDataTypes.id, "0", null, null, "offered_subject_id", ColumnType.OptionalData), 
			new DbField("subjectId", 2, DefinedDataTypes.id, "0", null, null, "subject_id", ColumnType.OptionalData), 
			new DbField("levelName", 3, DefinedDataTypes.text, null, null, null, "level_name", ColumnType.OptionalData), 
			new DbField("subjectName", 4, DefinedDataTypes.name, null, null, null, "subject_name", ColumnType.OptionalData), 
			new DbField("subjectCode", 5, DefinedDataTypes.name, null, null, null, "subject_code", ColumnType.OptionalData), 
			new DbField("sectionName", 6, DefinedDataTypes.name, null, null, null, "section_name", ColumnType.OptionalData), 
			new DbField("isIntegrated", 7, DefinedDataTypes.bool, "false", null, null, "is_integrated", ColumnType.RequiredData), 
			new DbField("date", 8, DefinedDataTypes.date, null, null, null, null, ColumnType.OptionalData), 
			new DbField("finalExam", 9, DefinedDataTypes.date, null, null, null, null, ColumnType.OptionalData), 
			new DbField("assignedStaff", 10, DefinedDataTypes.text, null, null, null, null, ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, false, true, false, true, false};
	private static final String SELECT = "SELECT subject_section_id, offered_subject_id, subject_id, level_name, subject_name, subject_code, section_name, is_integrated, null, null, null FROM cie_downloads";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final  String INSERT = "INSERT INTO cie_downloads(subject_section_id, offered_subject_id, subject_id, level_name, subject_name, subject_code, section_name, is_integrated, null, null, null) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	private static final String WHERE = " WHERE subject_section_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE cie_downloads SET offered_subject_id= ? , subject_id= ? , level_name= ? , subject_name= ? , subject_code= ? , section_name= ? , is_integrated= ? , null= ? , null= ? , null= ?  WHERE subject_section_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
	private static final String DELETE = "DELETE FROM cie_downloads";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public CieDownloadSchema() {
		this.name = "cieDownload";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "cie_downloads";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(11, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, null, -1, null);
		this.initialize();
	}

	@Override
	public CieDownloadData newSchemaData() {
		return new CieDownloadData(this, null);
	}

	@Override
	protected CieDownloadData newSchemaData(final Object[] data) {
		return new CieDownloadData(this, data);
	}

	@Override
	public CieDownloadData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (CieDownloadData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public CieDownloadData parseKeys(JsonObject json, IServiceContext ctx) {
		return (CieDownloadData) super.parseKeys(json, ctx);
	}

	@Override
	public CieDownloadDataTable newSchemaDataTable() {
		return new CieDownloadDataTable(this, null);
	}

	@Override
	protected CieDownloadDataTable newSchemaDataTable(final Object[][] data) {
		return new CieDownloadDataTable(this, data);
	}

	@Override
	public CieDownloadDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (CieDownloadDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
