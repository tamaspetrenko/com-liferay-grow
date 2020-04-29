create table FavouritesList_Favourite (
	uuid_ VARCHAR(75) null,
	favouriteId LONG not null primary key,
	assetEntryId LONG,
	companyId LONG,
	groupId LONG,
	addedDate DATE null,
	userId LONG
);