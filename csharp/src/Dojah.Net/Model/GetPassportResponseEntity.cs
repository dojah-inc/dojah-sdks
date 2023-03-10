/*
 * DOJAH APIs
 *
 * Use Dojah to verify, onboard and manage user identity across Africa!
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Dojah.Net.Client.OpenAPIDateConverter;

namespace Dojah.Net.Model
{
    /// <summary>
    /// GetPassportResponseEntity
    /// </summary>
    [DataContract(Name = "GetPassportResponse_entity")]
    public partial class GetPassportResponseEntity : IEquatable<GetPassportResponseEntity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetPassportResponseEntity" /> class.
        /// </summary>
        /// <param name="dateOfBirth">dateOfBirth.</param>
        /// <param name="expiryDate">expiryDate.</param>
        /// <param name="firstName">firstName.</param>
        /// <param name="gender">gender.</param>
        /// <param name="id">id.</param>
        /// <param name="isDateOfBirthMatch">isDateOfBirthMatch.</param>
        /// <param name="isFirstNameMatch">isFirstNameMatch.</param>
        /// <param name="isLastNameMatch">isLastNameMatch.</param>
        /// <param name="isMiddleNameMatch">isMiddleNameMatch.</param>
        /// <param name="issueDate">issueDate.</param>
        /// <param name="lastName">lastName.</param>
        /// <param name="middleName">middleName.</param>
        /// <param name="picture">picture.</param>
        /// <param name="placeOfBirth">placeOfBirth.</param>
        /// <param name="placeOfIssue">placeOfIssue.</param>
        /// <param name="status">status.</param>
        public GetPassportResponseEntity(string dateOfBirth = default(string), string expiryDate = default(string), string firstName = default(string), string gender = default(string), string id = default(string), bool isDateOfBirthMatch = default(bool), bool isFirstNameMatch = default(bool), bool isLastNameMatch = default(bool), bool isMiddleNameMatch = default(bool), string issueDate = default(string), string lastName = default(string), string middleName = default(string), string picture = default(string), string placeOfBirth = default(string), string placeOfIssue = default(string), decimal status = default(decimal))
        {
            this.DateOfBirth = dateOfBirth;
            this.ExpiryDate = expiryDate;
            this.FirstName = firstName;
            this.Gender = gender;
            this.Id = id;
            this.IsDateOfBirthMatch = isDateOfBirthMatch;
            this.IsFirstNameMatch = isFirstNameMatch;
            this.IsLastNameMatch = isLastNameMatch;
            this.IsMiddleNameMatch = isMiddleNameMatch;
            this.IssueDate = issueDate;
            this.LastName = lastName;
            this.MiddleName = middleName;
            this.Picture = picture;
            this.PlaceOfBirth = placeOfBirth;
            this.PlaceOfIssue = placeOfIssue;
            this.Status = status;
        }

        /// <summary>
        /// Gets or Sets DateOfBirth
        /// </summary>
        [DataMember(Name = "date_of_birth", EmitDefaultValue = false)]
        public string DateOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets ExpiryDate
        /// </summary>
        [DataMember(Name = "expiry_date", EmitDefaultValue = false)]
        public string ExpiryDate { get; set; }

        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name = "first_name", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// Gets or Sets Gender
        /// </summary>
        [DataMember(Name = "gender", EmitDefaultValue = false)]
        public string Gender { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets IsDateOfBirthMatch
        /// </summary>
        [DataMember(Name = "is_date_of_birth_match", EmitDefaultValue = true)]
        public bool IsDateOfBirthMatch { get; set; }

        /// <summary>
        /// Gets or Sets IsFirstNameMatch
        /// </summary>
        [DataMember(Name = "is_first_name_match", EmitDefaultValue = true)]
        public bool IsFirstNameMatch { get; set; }

        /// <summary>
        /// Gets or Sets IsLastNameMatch
        /// </summary>
        [DataMember(Name = "is_last_name_match", EmitDefaultValue = true)]
        public bool IsLastNameMatch { get; set; }

        /// <summary>
        /// Gets or Sets IsMiddleNameMatch
        /// </summary>
        [DataMember(Name = "is_middle_name_match", EmitDefaultValue = true)]
        public bool IsMiddleNameMatch { get; set; }

        /// <summary>
        /// Gets or Sets IssueDate
        /// </summary>
        [DataMember(Name = "issue_date", EmitDefaultValue = false)]
        public string IssueDate { get; set; }

        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name = "last_name", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// Gets or Sets MiddleName
        /// </summary>
        [DataMember(Name = "middle_name", EmitDefaultValue = false)]
        public string MiddleName { get; set; }

        /// <summary>
        /// Gets or Sets Picture
        /// </summary>
        [DataMember(Name = "picture", EmitDefaultValue = false)]
        public string Picture { get; set; }

        /// <summary>
        /// Gets or Sets PlaceOfBirth
        /// </summary>
        [DataMember(Name = "place_of_birth", EmitDefaultValue = false)]
        public string PlaceOfBirth { get; set; }

        /// <summary>
        /// Gets or Sets PlaceOfIssue
        /// </summary>
        [DataMember(Name = "place_of_issue", EmitDefaultValue = false)]
        public string PlaceOfIssue { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public decimal Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetPassportResponseEntity {\n");
            sb.Append("  DateOfBirth: ").Append(DateOfBirth).Append("\n");
            sb.Append("  ExpiryDate: ").Append(ExpiryDate).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  Gender: ").Append(Gender).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsDateOfBirthMatch: ").Append(IsDateOfBirthMatch).Append("\n");
            sb.Append("  IsFirstNameMatch: ").Append(IsFirstNameMatch).Append("\n");
            sb.Append("  IsLastNameMatch: ").Append(IsLastNameMatch).Append("\n");
            sb.Append("  IsMiddleNameMatch: ").Append(IsMiddleNameMatch).Append("\n");
            sb.Append("  IssueDate: ").Append(IssueDate).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  Picture: ").Append(Picture).Append("\n");
            sb.Append("  PlaceOfBirth: ").Append(PlaceOfBirth).Append("\n");
            sb.Append("  PlaceOfIssue: ").Append(PlaceOfIssue).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as GetPassportResponseEntity);
        }

        /// <summary>
        /// Returns true if GetPassportResponseEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of GetPassportResponseEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetPassportResponseEntity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DateOfBirth == input.DateOfBirth ||
                    (this.DateOfBirth != null &&
                    this.DateOfBirth.Equals(input.DateOfBirth))
                ) && 
                (
                    this.ExpiryDate == input.ExpiryDate ||
                    (this.ExpiryDate != null &&
                    this.ExpiryDate.Equals(input.ExpiryDate))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.Gender == input.Gender ||
                    (this.Gender != null &&
                    this.Gender.Equals(input.Gender))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.IsDateOfBirthMatch == input.IsDateOfBirthMatch ||
                    this.IsDateOfBirthMatch.Equals(input.IsDateOfBirthMatch)
                ) && 
                (
                    this.IsFirstNameMatch == input.IsFirstNameMatch ||
                    this.IsFirstNameMatch.Equals(input.IsFirstNameMatch)
                ) && 
                (
                    this.IsLastNameMatch == input.IsLastNameMatch ||
                    this.IsLastNameMatch.Equals(input.IsLastNameMatch)
                ) && 
                (
                    this.IsMiddleNameMatch == input.IsMiddleNameMatch ||
                    this.IsMiddleNameMatch.Equals(input.IsMiddleNameMatch)
                ) && 
                (
                    this.IssueDate == input.IssueDate ||
                    (this.IssueDate != null &&
                    this.IssueDate.Equals(input.IssueDate))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.MiddleName == input.MiddleName ||
                    (this.MiddleName != null &&
                    this.MiddleName.Equals(input.MiddleName))
                ) && 
                (
                    this.Picture == input.Picture ||
                    (this.Picture != null &&
                    this.Picture.Equals(input.Picture))
                ) && 
                (
                    this.PlaceOfBirth == input.PlaceOfBirth ||
                    (this.PlaceOfBirth != null &&
                    this.PlaceOfBirth.Equals(input.PlaceOfBirth))
                ) && 
                (
                    this.PlaceOfIssue == input.PlaceOfIssue ||
                    (this.PlaceOfIssue != null &&
                    this.PlaceOfIssue.Equals(input.PlaceOfIssue))
                ) && 
                (
                    this.Status == input.Status ||
                    this.Status.Equals(input.Status)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DateOfBirth != null)
                {
                    hashCode = (hashCode * 59) + this.DateOfBirth.GetHashCode();
                }
                if (this.ExpiryDate != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiryDate.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.Gender != null)
                {
                    hashCode = (hashCode * 59) + this.Gender.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsDateOfBirthMatch.GetHashCode();
                hashCode = (hashCode * 59) + this.IsFirstNameMatch.GetHashCode();
                hashCode = (hashCode * 59) + this.IsLastNameMatch.GetHashCode();
                hashCode = (hashCode * 59) + this.IsMiddleNameMatch.GetHashCode();
                if (this.IssueDate != null)
                {
                    hashCode = (hashCode * 59) + this.IssueDate.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.MiddleName != null)
                {
                    hashCode = (hashCode * 59) + this.MiddleName.GetHashCode();
                }
                if (this.Picture != null)
                {
                    hashCode = (hashCode * 59) + this.Picture.GetHashCode();
                }
                if (this.PlaceOfBirth != null)
                {
                    hashCode = (hashCode * 59) + this.PlaceOfBirth.GetHashCode();
                }
                if (this.PlaceOfIssue != null)
                {
                    hashCode = (hashCode * 59) + this.PlaceOfIssue.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Status.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}