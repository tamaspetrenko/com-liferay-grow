create table FavouritesList_Favourite (
	uuid_ VARCHAR(75) null,
	favouriteId LONG not null primary key,
	assetEntryId LONG,
	companyId LONG,
	groupId LONG,
	addedDate DATE null,
	userId LONG
);

create table FavouritesList_Favourites (
	uuid_ VARCHAR(75) null,
	favouritesId LONG not null primary key,
	assetEntryId LONG,
	companyId LONG,
	addedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null
);

create table FavouritesList_FavouritesList (
	uuid_ VARCHAR(75) null,
	favouritesListId LONG not null primary key,
	assetEntryId LONG,
	companyId LONG,
	addedDate DATE null,
	userId LONG,
	userName VARCHAR(75) null
);