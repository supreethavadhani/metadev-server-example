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
 * class that represents structure of levelSection
 */ 
public class LevelSectionSchema extends Schema {	private static final DbField[] FIELDS = {
			new DbField("levelSectionId", 0, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.GeneratedPrimaryKey), 
			new DbField("levelId", 1, DefinedDataTypes.id, null, null, null, "level_id", ColumnType.RequiredData), 
			new DbField("sectionId", 2, DefinedDataTypes.id, null, null, null, "section_id", ColumnType.RequiredData), 
			new DbField("programId", 3, DefinedDataTypes.id, "0", null, null, "program_id", ColumnType.OptionalData), 
			new DbField("isActive", 4, DefinedDataTypes.bool, "true", null, null, "is_active", ColumnType.OptionalData)
	};
	private static final  boolean[] OPS = {true, true, true, true, true, true};
	private static final String SELECT = "SELECT level_id, level_id, section_id, program_id, is_active FROM level_sections";
	private static final int[] SELECT_IDX = {0, 1, 2, 3, 4};
	private static final  String INSERT = "INSERT INTO level_sections(level_id, section_id, program_id, is_active) values (?, ?, ?, ?)";
	private static final int[] INSERT_IDX = {1, 2, 3, 4};
	private static final String WHERE = " WHERE level_id=?";
	private static final int[] WHERE_IDX = {0};
	private static final  String UPDATE = "UPDATE level_sections SET level_id= ? , section_id= ? , program_id= ? , is_active= ?  WHERE level_id=?";
	private static final  int[] UPDATE_IDX = {1, 2, 3, 4, 0};
	private static final String DELETE = "DELETE FROM level_sections";
	private static final IValidation[] VALIDS = {
	};

	/**
	 *
	 */
	public LevelSectionSchema() {
		this.name = "levelSection";
		this.fields = FIELDS;
		this.validations = VALIDS;
		this.nameInDb = "level_sections";
		this.operations = OPS;

		this.dbAssistant = new DbAssistant(5, null, SELECT, this.getParams(SELECT_IDX), WHERE, this.getParams(WHERE_IDX), INSERT, this.getParams(INSERT_IDX), UPDATE, this.getParams(UPDATE_IDX), DELETE, "level_id", 0, null);
		this.initialize();
	}

	@Override
	public LevelSectionData newSchemaData() {
		return new LevelSectionData(this, null);
	}

	@Override
	protected LevelSectionData newSchemaData(final Object[] data) {
		return new LevelSectionData(this, data);
	}

	@Override
	public LevelSectionData parseData(JsonObject json, boolean forInsert, IServiceContext ctx, String tableName, int row) {
		return (LevelSectionData) super.parseData(json, forInsert, ctx, tableName, row);
	}

	@Override
	public LevelSectionData parseKeys(JsonObject json, IServiceContext ctx) {
		return (LevelSectionData) super.parseKeys(json, ctx);
	}

	@Override
	public LevelSectionDataTable newSchemaDataTable() {
		return new LevelSectionDataTable(this, null);
	}

	@Override
	protected LevelSectionDataTable newSchemaDataTable(final Object[][] data) {
		return new LevelSectionDataTable(this, data);
	}

	@Override
	public LevelSectionDataTable parseTable(JsonArray arr, boolean forInsert, IServiceContext ctx, String tableName) {
		return (LevelSectionDataTable) super.parseTable(arr, forInsert, ctx, tableName);
	}
}
