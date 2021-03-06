constraint_AuthorizedAccess(ConstraintName, QueryType, OP, S, ST, VarSet_authRoles, VarSet_accessRoles) :-
	ConstraintName = 'AuthorizedAccess',
	constraint_AuthorizedAccess_PreCallState(QueryType, OP, S, ST, VarSet_authRoles, VarSet_accessRoles).
constraint_AuthorizedAccess_PreCallState(QueryType, OP, S, ST, VarSet_authRoles, VarSet_accessRoles) :-
	QueryType = 'PreCallState',
	S = [OP | _],
	stackValid(S),
	operationState(OP, ST),
	findall(IteratorTemplate, preCallState(S, OP, ST, 'EnumCharacteristicType AccessRights (_rkiSMFqnEeiY18w7ObeSrg)', IteratorTemplate), VarSet_authRoles),
	findall(IteratorTemplate, operationProperty(OP, 'EnumCharacteristicType Roles (_vP5JoFqnEeiY18w7ObeSrg)', IteratorTemplate), VarSet_accessRoles),
	( intersection(VarSet_authRoles, VarSet_accessRoles, Temp_0),
	\+ length(Temp_0, 0) ).